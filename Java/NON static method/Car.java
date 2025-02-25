
public class Car {
    String carModel;
    int manufacturingYear;
    String carMake;
    String displayDetails(){
        return "Car Model : "+carModel+"\nManufacturing Year : "+manufacturingYear+"\nCar Make : "+carMake;
    }
    void addCarDetails(String Model, int year, String make ){
        carMake=make;
        manufacturingYear=year;
        carModel=model;
    }
    public static void main(String[] args) {
        Car c1= new Car();
        c1.addCarDetails("A1 Horse", 2003, "Toyota");
        System.out.println(c1.displayDetails());
    }
}
