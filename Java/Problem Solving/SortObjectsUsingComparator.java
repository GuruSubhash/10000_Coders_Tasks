import java.util.Arrays;
import java.util.Comparator;

class Employee{
    private String name;
    
    Employee(String name, Integer empId){
        this.name=name;
        this.empId=empId;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", empId=" + empId + "]";
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getEmpId() {
        return empId;
    }
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    private Integer empId;
}

public class SortObjectsUsingComparator {
    public static void main(String[] args) {
        Employee e1=new Employee("Subhash", 66);
        Employee e2=new Employee("Guru", 12);
        Employee e3=new Employee("Deepika", 27);
        Employee[] emps={e1,e2,e3};
        // for(int i=0; i<emps.length;++i){
        //     for(int j=0; j<emps.length;++j){
        //         if(emps[i].getEmpId()<emps[j].getEmpId()){
        //             Employee temp=emps[i];
        //             emps[i]=emps[j];
        //             emps[j]=temp;
        //         }
        //     }
        // }
        // for(Employee e:emps)System.out.println(e);


        Comparator<Employee> nameComparator =(Employee p1, Employee p2) ->  p1.getName().compareTo(p2.getName());

        // Sort array using Comparator
        Arrays.sort(emps, nameComparator);
        System.out.println(Arrays.toString(emps));
    }
}
