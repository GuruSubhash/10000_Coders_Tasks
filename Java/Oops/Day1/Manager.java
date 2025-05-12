class Employee{
    int salary=50000;
}
public class Manager extends Employee{
    int bonus=20000;
    public static void main(String[] args) {
        Manager m= new Manager();
        System.out.println("Total Salary :  "+(m.bonus+m.salary));   
    }
}