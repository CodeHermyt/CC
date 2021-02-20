package array;

public class MaxMin {

    static class MyPairs{
        int max;
        int min;
    }


    static MyPairs getMaxMin(int[] arr, int low, int high){

        MyPairs myMinMax = new MyPairs();
        MyPairs mml;
        MyPairs mmh;

        if(low == high){
            myMinMax.min = arr[low];
            myMinMax.max = arr[low];
            return myMinMax;
        }

        if(high == low + 1){

            myMinMax.min = arr[low]<=arr[high] ? arr[low] : arr[high];
            myMinMax.max = arr[low]<=arr[high] ? arr[high] : arr[low];
            return myMinMax;
        }

        int mid = (low+high)/2;
        mml = getMaxMin(arr, low, mid);
        mmh = getMaxMin(arr, mid+1, high);

        // Compaing min 
        myMinMax.min = mml.min>=mmh.min ? mmh.min: mml.min;
        // COmparing max
        myMinMax.max = mml.max>=mmh.max? mml.max : mmh.max;

        return myMinMax;
    }

    public static void main(String[] args) {

        int [] arr = {1,4,2,4,2,7,5,3,8,3,9,10,89,6,79,82,95,93};
        MyPairs minmax = getMaxMin(arr, 0, arr.length-1);
        System.out.println("Min = " + minmax.min);
        System.out.println("Max = " + minmax.max);        
    }
    
}
