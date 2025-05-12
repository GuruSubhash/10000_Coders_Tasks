
public class P6 {
    public static void main(String[] args) {
        int num=6;
        for(int i=1; i<=num;++i){
            for(int j=i; j<=num;++j) System.out.print(j);
            System.out.println();
        }
        for(int i=--num; i>=1;--i){
            for(int j=i; j<=6;++j) System.out.print(j);
            System.out.println();
        }
    }
}
