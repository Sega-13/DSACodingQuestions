//Leetcode - 724
public class FindPivotIndex {
    public  int findingPivot(int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            rightSum += arr[i];
        }
        for(int i= 0;i<arr.length; i++){
            // update right sum
            rightSum -= arr[i];
            //check for both
            if(leftSum == rightSum){
                return i;
            }
            //update left sum
            leftSum += arr[i];
        }
        return -1;
    }
}
