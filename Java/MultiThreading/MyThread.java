public class MyThread extends Thread {
    public void run(){
        for(int i=0; i<5; ++i){
            System.out.println("Hello from MyThread");
        }
    }
    public static void main(String[] args) {
        Thread td=new MyThread();
        td.start();
    }
}
