public class MoveZeros {
    public void movingZeros(int[] arr){
        int index = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        System.out.println("Moved Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }
}
