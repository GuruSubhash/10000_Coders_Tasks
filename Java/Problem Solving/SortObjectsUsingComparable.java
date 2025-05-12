import java.util.Arrays;

class Employee implements Comparable<Employee> {
    private Integer empID;
    private String name;
    Employee(Integer id, String name){
        this.empID=id;
        this.name=name;
    }
    public Integer getEmpID() {
        return empID;
    }
    public void setEmpID(Integer empID) {
        this.empID = empID;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee [empID=" + empID + ", name=" + name + "]";
    }
    public void setName(String name) {
        this.name = name;
    }
    public int compareTo(Employee e){
        return this.getName().compareTo(e.getName());
    }
}

public class SortObjectsUsingComparable {

    public static void main(String[] args) {
        Employee[] emps={new Employee(12, "Hardhik"),new Employee(6, "HardhiK")};
        Arrays.sort(emps);
        for(Employee e: emps)System.out.println(e);
    }
}