import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] =new int[size];
        for(int i=0; i<size;++i) arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        if(size%2==0)for(int i=0; i<((size)/2);++i){
            arr[i]=arr[i]^arr[size-1-i];
            arr[size-1-i]=arr[i]^arr[size-1-i];
            arr[i]=arr[i]^arr[size-i-1];
        }
        else{
            for(int i=0; i<=((size)/2);++i){
                if(i==((size-1)/2)) continue;
                else{
                    arr[i]=arr[i]^arr[size-1-i];
                arr[size-1-i]=arr[i]^arr[size-1-i];
                arr[i]=arr[i]^arr[size-i-1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
