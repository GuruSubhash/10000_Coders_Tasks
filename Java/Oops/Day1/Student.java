class Person{
    Person(){
        System.out.println("Person object created");
    }
}
public class Student extends Person {
    public static void main(String[] args) {
        Student s= new Student();
    }
}
