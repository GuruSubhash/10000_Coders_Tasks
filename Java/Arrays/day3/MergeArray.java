import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int [] arr1 ={10,20,30};
        int[] arr2 = {40,50,60};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length;++i) arr3[i]=arr1[i];
        for(int i=0; i<arr2.length; ++i) arr3[i+arr1.length]=arr2[i];
        System.out.println("Array 1 : " + (Arrays.toString(arr1)));
        System.out.println("Array 1 : " + (Arrays.toString(arr2)));
        System.out.println("Array 1 : " + (Arrays.toString(arr3)));
    }
}
