public class ShowThreadName extends Thread{
    public void run(){
        System.out.println("Thread name : "+ Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t= new ShowThreadName();
        t.start();
        t.setName("MyCustomThread");
       
    }
}
