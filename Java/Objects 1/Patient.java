
public class Patient {
    static String hospitalName="Srivani Hospital";
    String patientName;
    int age;
    
    public static String getHospitalName() {
        return hospitalName;
    }

    public static void setHospitalName(String hospitalName) {
        Patient.hospitalName = hospitalName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public void printDetails() {
        System.out.println("Patient [patientName=" + patientName + ", age=" + age + ", hospitalName= " + hospitalName + "]");
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.setAge(22);
        p.setPatientName("sdkfjsk");
        p.printDetails();
    }
}
