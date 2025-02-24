
public class Employee {
    int employeeId;
    String employeeName;
    double salary;

    void setEmployeeId(int empId){
        employeeId=empId;
    }
    void setEmployeeName(String empName){
        employeeName=empName;
    }
    void setSalary(double sal){
        salary=sal;
    }
    int getEmployeeId(){
        return employeeId;
    }
    String getEmployeeName(){
        return employeeName;
    }
    double getSalary(){
        return salary;
    }
}
