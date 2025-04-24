
@FunctionalInterface
public interface Timer {
    void startTimer(int seconds);
    public static void main(String[] args) {
        Timer t= new Timer(){
            public void startTimer(int sec){
                System.out.println("Timer started for "+ sec + " seconds. ");
            }
        };
        t.startTimer(3);
    }
}
@FunctionalInterface
interface InnerTimer1 extends Timer {
    public static void main(String[] args) {
       System.out.println("lksfjdk");
    }
    
}
@FunctionalInterface
interface InnerTimer extends Timer, InnerTimer1 {
    public static void main(String[] args) {
       System.out.println("lksfjdk");
    }
    
}
