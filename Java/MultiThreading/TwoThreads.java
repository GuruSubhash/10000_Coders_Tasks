class FirstThread extends Thread{
    public void run(){
        for(int i=0; i<5; ++i) System.out.println("Second Thread Message");
    }
}
class SecondThread extends Thread{
    public void run(){
        for(int i=0; i<5; ++i) System.out.println("First Thread Message");
    }
}
public class TwoThreads {
    public static void main(String[] args) {
        Thread t= new FirstThread();
        Thread t2= new SecondThread();
        t.start();
        t2.start();
    }
}
