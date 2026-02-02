//Leetcode - 1480
public class RunningSum {
    public  int[] getRunningSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }
}
