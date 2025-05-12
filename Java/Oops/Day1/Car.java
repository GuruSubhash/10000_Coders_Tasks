class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }

}
public class Car extends Vehicle{
    void speed(){
        System.out.println("Car is moving at 80 km/h");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.run();
        c.speed();
    }
}
