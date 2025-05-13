public class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<3;++i){
            System.out.println("Runnable thread is running");
        }
    }
    public static void main(String[] args) {
        Runnable mr=new MyRunnable();
        Thread t= new Thread(mr);
        t.start();
    }
}
