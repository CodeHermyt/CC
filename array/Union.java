import java.util.Arrays;
import java.util.Scanner;

public class Union {

    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();

    int[] arr1 = new int[n];
    for(int i = 0; i<n; i++){
        arr1[i] = in.nextInt();
    }
    
    int [] arr2 = new int[m];
    for(int i = 0; i<m; i++){
        arr2[i] = in.nextInt();
    }

    int[] finalarr = new int[m+n];
    for(int i = 0; i<m+n; i++){
        if(i<n){
            finalarr[i] = arr1[i];
        }
        else{
            finalarr[i] = arr2[i-n];
        }
    }

    Arrays.sort(finalarr);
    int count = 1;
    // int x = finalarr[0];
    for(int i = 1; i<m+n; i++){
        System.out.println("Elem = " + finalarr[i]);
        if(finalarr[i] == finalarr[i-1]){
            continue;
        }
        count++;

        System.out.println(count);

    }

    System.out.println(count);

    
}

}
