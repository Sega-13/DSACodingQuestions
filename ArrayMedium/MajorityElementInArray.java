//Leetcode- 169
public class MajorityElementInArray {
    public int getMajorityElement(int[] arr){
        //Majority elem means element present more than n/2 times in array
        //solution using more's voting algorithm
        //Calculate freq
        // if same element than freq++
        // if diff element than freq--

        int freq =0;
        int ans =0;
        for(int i=0; i<arr.length;i++){
            if(freq == 0)
                ans = arr[i];
            if(ans == arr[i])
                freq++;
            else
                freq --;

        }
        return ans;
    }
}
