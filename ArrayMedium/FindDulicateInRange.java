// Leetcode-287
public class FindDulicateInRange {
    public int returnDuplicateElement(int[] arr){
        // Using Floyd’s Cycle Detection Algorithm

        int fast = 0;
        int slow = 0;

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow =0;
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
