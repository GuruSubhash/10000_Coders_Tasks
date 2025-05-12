
public class P7 {
    public static void main(String[] args) {
        int num=11;
        String str=" ";
        System.out.println("*".repeat(num));
        for(int i=num-1;i>0;--i) System.out.println("*"+str.repeat(i)+"*");
        System.out.println("*");
    }
}
