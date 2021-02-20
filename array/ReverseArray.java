package array;


public class ReverseArray{

    public static void main(String [] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        int l = arr.length;
        for(int i = 0, j= l-1; j>i; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}


