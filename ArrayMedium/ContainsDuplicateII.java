import java.util.HashSet;

// Leetcode-219
public class ContainsDuplicateII {
    public boolean checkDuplicateWithCondition(int[] arr, int k){
        // using sliding window
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(hs.contains(arr[i])){
                return true;
            }
            hs.add(arr[i]);
            //applying sliding window
            //because we want duplicate ele only if abs(i - j) <= k
            if(hs.size()> k){
                hs.remove(arr[i-k]);
            }
        }
        return  false;
    }
}
