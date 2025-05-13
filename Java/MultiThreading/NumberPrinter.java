public class NumberPrinter implements Runnable{
    public void run(){
        for(int i=0; i<3;++i) System.out.println(i);
    } 
    public static void main(String[] args) {
        Runnable r=new NumberPrinter();
       Thread t= new Thread(r);
       t.start();
    }
}
