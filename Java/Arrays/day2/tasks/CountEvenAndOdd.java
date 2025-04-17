import java.util.Scanner;

public class CountEvenAndOdd {
    public static int evenCount(int[] arr) {
        int count =0;
        for(int ele:arr) if(ele%2==0) count++;
        return count;
    }
    public static int oddCount(int[] arr) {
        int count =0;
        for(int ele:arr) if(ele%2!=0) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0; i<arr.length;++i) arr[i]=sc.nextInt();
        System.out.println("Even Count : "+ evenCount(arr));
        System.out.println("Odd Count : "+ oddCount(arr));
    }
}
