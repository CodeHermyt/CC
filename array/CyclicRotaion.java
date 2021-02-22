// Given an array, rotate the array by one position in clock-wise direction.

public class CyclicRotaion {



    public static void main(String[] args){

        int [] A = {1, 2, 3,4, 5, 6};
        int l = A.length;

        for(int i=l-1; i>0; i--){
            int temp = A[i];
            A[i] = A[i-1];
            A[i-1] = temp;
        }

        for(int i:A){
            System.out.print(i + " ");
        }
    }
    
}
