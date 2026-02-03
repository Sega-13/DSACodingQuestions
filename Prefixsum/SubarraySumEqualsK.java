import java.util.HashMap;

// Leetcode- 560
public class SubarraySumEqualsK {
    public int countOfSubarrayEqualsK(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int count = 0;
        //Sum, Freq
        map.put(0,1);
        for(int num : arr){
            sum += num; //sum calculations
            //checking sum key contains in map if yes
            // will add its value to count
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            //map.getOrDefault(sum,0) if sum present in map gives value
            // else return 0, +1 becoz we have already seen  before.
            map.put(sum, map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
