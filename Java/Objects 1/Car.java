
public class Car {
    public static String getShowroomName() {
        return showroomName;
    }
    public String getModelName() {
        return modelName;
    }
    public double getPrice() {
        return price;
    }
    static String showroomName="Elite Motors";
    String modelName;
    double price;
public static void setShowroomName(String showroomName) {
        Car.showroomName = showroomName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String  displayDetails(){
        return "Car [modelName=" + modelName + ", price=" + price +" showroomName = " + showroomName + "]";
    }
public static void main(String[] args) {
    Car c = new Car();
    c.setModelName("A1");
    c.setPrice(100000);
    System.out.println(c.displayDetails());

    Car c1 = new Car();
    c1.setModelName("B1");
    c1.setPrice(100000);
    System.out.println(c1.displayDetails());
}

}
