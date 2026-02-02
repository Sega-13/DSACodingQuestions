// Leetcode-303
public class RangeSumQuery {

    public int returnRangeSumQuery(int[] arr, int left, int right){
        int[] sumArr = new int[arr.length];
        sumArr[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            sumArr[i] += sumArr[i-1]+ arr[i];
        }
        if(left == 0){
            return sumArr[right];
        }
        return sumArr[right] -sumArr[left-1];
    }
}
