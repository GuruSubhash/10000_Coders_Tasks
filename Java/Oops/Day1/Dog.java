class Animal{
    void display(){
        System.out.println("This is an animal");
    }
}
public class Dog extends Animal {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
    }
}
