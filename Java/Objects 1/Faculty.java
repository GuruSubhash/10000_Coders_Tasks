
public class Faculty {

    static String universityName="JNTU";
    String facultyName="Guru Subhash";
    String department;
    public static String getUniversityName() {
        return universityName;
    }
    public static void setUniversityName(String universityName) {
        Faculty.universityName = universityName;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void printFacultyDetails() {
        System.out.println("Faculty [facultyName=" + facultyName + ", department=" + department + ", universityName= " + universityName+"]");
    }
    public static void main(String[] args) {
        Faculty f = new Faculty();
        f.setDepartment("CSE");
        f.setFacultyName("Guru Subhash");

        f.printFacultyDetails();
    }
}
