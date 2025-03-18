
public class Mobile {
    static String storeName="Whole Sale Store";
    String brand;
    int price;
     
    public static String getStoreName() {
        return storeName;
    }

    public static void setStoreName(String storeName) {
        Mobile.storeName = storeName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Mobile [brand=" + brand + ", price=" + price + ", storeName= " + storeName + "]");
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.setBrand("Britania");
        m.setPrice(20000);
        m.displayDetails();
    }
}
