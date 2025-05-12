
public class SumOfEle {
    public static void main(String[] args) {
        int arr[]=new int[]{12,34,54,1,-2,21,34,1};
        int evenSum=0;
        int oddSum=0;
        for(int i=0; i<arr.length;i+=2)evenSum+=arr[i];
        for(int i=1; i<arr.length;i+=2) oddSum+=arr[i];
        System.out.println("Even indexes sum is : "+ evenSum);
        System.out.println("Odd indexes sum is : "+oddSum);
    }
}