
public class P2 {
    public static void main(String[] args) {
        String str=" ";
        String main="*";
        int num=6;
        for(int i=num; i>0;--i){
            System.out.println(main.repeat(i));
        }
        for(int i=2; i<num;++i){
            System.out.println(main.repeat(i));
        }
    }
}
