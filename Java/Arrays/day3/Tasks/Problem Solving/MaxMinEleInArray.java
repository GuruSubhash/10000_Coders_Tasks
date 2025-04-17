import java.util.Arrays;

public class MaxMinEleInArray {
    public static void main(String[] args) {
        int[] arr= {3,9,2,5,6};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;++i) if(min>arr[i]) min=arr[i];
        System.out.println("Minimum : "+min);
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; ++i) if(max<arr[i]) max=arr[i];
        System.out.println("Maximum : "+ max);


        // Arrays.sort(arr);
        // System.out.println("Minimum : " +arr[0]);
        // System.out.println("Minimum : " +arr[arr.length-1]);
        
    }
}
