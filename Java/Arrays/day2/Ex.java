
import java.util.Scanner;
import java.util.Arrays;
public class Ex {
    public static void arrayMake(Scanner sc){
        int size=sc.nextInt();
        if(size<1 || size>10){
            System.err.println("Invalid Message !");
            return;
        }
        String[] names=new String[size];
        sc.nextLine();
        for(int i=0; i<size; ++i){
            names[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int [] arr= new int[sc.nextInt()];
        // for(int i=0; i<arr.length;++i){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // long[] l=new int[5];
        // l[0]=sc.nextInt();


        
        // arrayMake(sc);
        System.out.println("infinity started...");
        // if(true) {
        //     do{}while (true); 
        //     for(;;){}
            
        // }
        Integer [] i=new Integer[5];
        System.out.println("infinity has no end...");

    }
}
