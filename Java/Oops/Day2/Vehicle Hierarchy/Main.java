 class Vehicle {
    String make;
    String model;
    int year;
    
    public String displayInfo() {
        return "make=" + make + "\nmodel=" + model + "\nyear=" + year;
    }
    
}


 class Car1 extends Vehicle {
    int noOfDoors;
    public void displayCarInfo(){
        System.out.println("no of doors : "+ noOfDoors);
    }
}

class MotorCycle  extends Vehicle{
    boolean hasSidecar;
    void displayMotorcycleInfo(){
        System.out.println("has Side car : "+ hasSidecar);
    }
}


 class Truck extends Vehicle {
    int cargoCapacity;
    void displayTruckInfo(){
        System.out.println("cargo capacity : "+ cargoCapacity);
    }
}


public class Main {
    public static void main(String[] args) {
        Car1 vc = new Car1();
        vc.displayCarInfo();
    }
}