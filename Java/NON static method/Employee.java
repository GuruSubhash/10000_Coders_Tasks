public class Employee {
    String employeeName;
    int employeeId;
    double employeeSalary;
    void addEmployeeDetails(String employeeName ,int  employeeId ,double employeeSalary){
        System.out.println();
    }
    String displayDetails(){
        return "Employee Name : "+employeeName+"\nEMployee id : "+employeeId+"\nEmployee Salary : "+employeeSalary;
    }
    
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.addEmployeeDetails("Guru subhash", 666, 9000);
        String str= emp.displayDetails();
        System.out.println(str);
    }
}
