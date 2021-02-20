package array;

public class KthMin{

    public static int partition(int[] arr, int l, int r){


        int pivot = arr[r];
        int i = l;
        for(int j = l; j<r-1; j++){

            if(arr[j]<=pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }

    public static int kthMin(int [] arr, int l, int r, int k){

        if(k>0 && k <= r-l+1){

            int pos = partition(arr, l, r);
            if(pos-l == k-1){
                return arr[pos];
            }
            if(pos-l > k-1){    // pos is right to K i.e. the kth element id in left subarray
                return kthMin(arr, l, pos-1, k);
            }
            // else in the Right subarray
            return kthMin(arr, pos+1, r, k - pos + l -1);

        }
        return Integer.MAX_VALUE;
    }


    public static void main(String[] args) {
        
        int [] arr = {7,3,2,5,1,9,10,13,8, 0};
        System.out.println("The 3rd smallest element = " + kthMin(arr, 0, arr.length-1, 3));
        System.out.println("The 5th smallest element = " + kthMin(arr, 0, arr.length-1, 5));
        System.out.println("The 1st smallest element = " + kthMin(arr, 0, arr.length-1, 1));
        // System.out.println("The 19th smallest element = " + kthMin(arr, 0, arr.length-1, 19));
        
        
    }


}