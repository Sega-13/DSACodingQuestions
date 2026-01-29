import java.util.LinkedHashSet;

public class ArrayEasyPrograms {
    // Find Max element

    public void findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Element is "+ max);
    }

    // Find Min
    public  void findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min element is : " + min);
    }

    //count Even & odd
    public void countEvenAndOdd(int[] arr){
        int even=0, odd=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even = "+ even +" odd = "+ odd);
    }

    //Check for sorted array
    public void checkForSortedArray(int[] arr){
        boolean sorted = true;
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] < arr[i-1]) {
                sorted = false;
                break;
            }
        }
        if(sorted)
            System.out.println("Given Array is sorted");
        else
            System.out.println("Given array is not sorted");
    }

    //linear search
    public void linearSearch(int[] arr, int key){
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key found at index "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("key not found");
        }
    }

    // Remove duplicate from array
    public void removeDuplicates(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int[] resultArr = new int[set.size()];
        int i =0;
        for(int x : set){
            resultArr[i] = x;
            System.out.println(resultArr[i]);
            i++;
        }
    }
    // Find Second largest element
    public  void secondLargestElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i]> second && arr[i] != largest){ // for duplicate largest value condition
                second = arr[i];
            }
        }
        System.out.println("Second largest values is "+ second);
    }
    // Reverse an array
    public void reverseArray(int[] arr){
        int l= 0, r= arr.length-1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println("Reversed Array is : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +", ");
        }
    }
}
