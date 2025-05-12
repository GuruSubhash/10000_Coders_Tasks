
public class P1 {
    public static void main(String[] args) {
        String str=" ";
        String main="*";
        int num=7;
        for(int i=1; i<num;++i){
            System.out.println(main.repeat(i));
        }
        for(int i=num; i>0;--i){
            System.out.println(main.repeat(i));
        }
    }
}
