
public class P4 {
    public static void main(String[] args) {
        String str=" ";
        String main="*";
        int num=14;
        for(int i=1; i<num;++i){
            System.out.println(main.repeat(i++));
        }
        for(int i=num-2; i>0;--i){
            System.out.println(main.repeat(--i));
        }
    }   
}
