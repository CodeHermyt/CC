
// Given an array A[] consisting 0s, 1s and 2s. 
// The task is to write a function that sorts the given array. 
// The functions should put all 0s first, then all 1s and all 2s in last.
package array;

import javax.print.event.PrintJobListener;

public class Sorting012 {

    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int ones=0; 
        int twos=0; 
        int zeros=0;
        for(int i: arr){
            if(i == 0)  zeros++;
            
            if(i==1)    ones++;

            if(i==2)    twos++;
        }
        
        int j = 0;
        for(int i =0; i<arr.length; i++){
            if (i<zeros){
                arr[i] = 0;
            }
            else if(i< zeros+ones){
                arr[i] = 1;
            }
            else{
                arr[i] = 2;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}
