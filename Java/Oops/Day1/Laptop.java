class Computer{
    void showBrand(){
        System.out.println("Brand: Dell");
    }
}
public class Laptop extends Computer {
    void showModel(){
        System.out.println("Model: XPS 15");
    }
    public static void main(String[] args) {
        Laptop l= new Laptop();
        l.showBrand();
        l.showModel();
    }
}
