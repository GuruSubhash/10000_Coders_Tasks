
public class PayrollSystem {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.setEmployeeId(666);
        e1.setEmployeeName("Guru Subhash");
        e1.setSalary(9000.00);
        System.out.println("employee id : "+ e1.getEmployeeId()+"\nEmployee Name : "+e1.getEmployeeName()+"\nSalary name : "+e1.getSalary());
    }
}
