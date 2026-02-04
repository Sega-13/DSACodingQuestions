//leetcode-278
public class FirstBadVersion {
    public int findFirstBadVersion(int n){
        int left = 1;
        int right = n;

        while(left < right){
            int mid = left + (right-left)/2;
            //function already present in leetcode
            if(isBadVersion(mid)){
                right = mid; // first bad is at mid or before
            }else{
                left = mid+1; // first bad version is after mid
            }
        }
        return left;
    }

    boolean isBadVersion(int version) {
        int firstBad =4;
        return version >= firstBad;
    }
}
