import java.util.Scanner;

public class PalinCheck {
    static public boolean [] dynmc_arr=new boolean[(int)Math.pow(2,31)-1999999999];
    public static boolean isPalic(int num){
        if(dynmc_arr[num]==true) return true;
        System.out.println("-----logic executing time consuming------");
        int temp=num;
        int rev=0;
        while(num>0){
            rev = rev*10 +(num%10);
            num/=10;
        }
        

        return rev==temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr =new int[sc.nextInt()];
        for(int i=0; i< arr.length;++i){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length;++i){
            System.out.println(arr[i]+ ((isPalic(arr[i])? " is a palindrome ":" is not a palindrome")) );
        }
        
    }
}
