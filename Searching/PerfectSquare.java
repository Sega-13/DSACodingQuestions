public class PerfectSquare {
    public boolean checkForPerfectSquare(int num){
        if(num == 0 && num == 1) return true;
        int left =1;
        int right = num;

        while(left <= right){
            int mid = left +(right-left)/2;
            int sq =  mid*mid;
            if(num == sq){
                return true;
            }else if(sq < num){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}
