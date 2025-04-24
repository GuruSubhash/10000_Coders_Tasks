
@FunctionalInterface
public interface Vehicle {
    void start();

    public static void main(String[] args) {
        Vehicle vc = new Vehicle(){
            public void start(){
                System.out.println("The vehicle is starting");
            }
        };
        vc.start();
    }
}
