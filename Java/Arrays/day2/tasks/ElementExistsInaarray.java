import java.util.Scanner;

public class ElementExistsInaarray {
    public static boolean isElementExists(int[] arr, int search) {
        for(int ele:arr) if(ele==search) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;++i) arr[i]=sc.nextInt();
        System.out.print("enter element you want to search : ");
        int search = sc.nextInt();
        System.out.println(search + ((isElementExists(arr, search))?"  element found in the array":"search element not found"));
    }
}
