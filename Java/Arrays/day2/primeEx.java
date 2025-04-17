import java.util.Scanner;

public class primeEx {
public static boolean isPrime(int num){
    boolean flag=true;
    for(int i=2;i*i<=num;++i){
        if(num%i==0){
            flag=false;
            break;
        } 
    }

    return flag;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[sc.nextInt()];

        for(int i=0; i<arr.length;++i){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+(isPrime(arr[i])?" is a prime number ":" is not a prime number "));
        }

    }
}
