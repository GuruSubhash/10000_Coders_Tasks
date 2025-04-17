import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[sc.nextInt()];
        for(int i=0; i<arr.length;++i) arr[i]=sc.nextInt();
        int sum=0;
        for(int ele:arr) sum+=ele;
        System.out.println("Sum of array elements = "+ sum);
    }
}
