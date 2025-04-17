import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayElements {
    public static int[] copyArray(int[] args) {
        return args;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[sc.nextInt()];
        for(int i=0; i<arr.length;++i) arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int copy_arr=copyArray(arr);
        System.out.println(Arrays.toString(copy_arr));
        
        System.out.println(arr);             //different addresses
        System.out.println(copy_arr);         //for arr and copy_arr

        // int[] copy_arr=arr;                          same address will be copied, so dont use, 
        // System.out.println(copy_arr);           because if done changes in arr then those changes will also occur inn copied array
    }
}
