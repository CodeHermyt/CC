// An array contains both positive and negative numbers in random order.
// Rearrange the array elements so that all negative numbers appear before all positive numbers.

public class NegativeFirst{

    public static void main(String[] args) {

        int [] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        for(int i: arr){
            System.out.print(i + " "); 
        }
        
    }
}

