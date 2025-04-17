
public class Patient {
    int patientId;
    String name;
    double testresults[];

    public Patient(int id, String name, double[] arr){
        this.patientId= id;
        this.name=name;
        testresults=arr;
    }
    public double getAverageResult(){
        double totalResult=0.00;
        for(int i=0; i<testresults.length;++i) totalResult+=testresults[i];
        return totalResult/5.0;
    }

    public boolean hasCriticalValue(){
        for(int i=0; i<testresults.length;++i) if(testresults[i]<50) return true;
        return false;
    }

    public void displayPatientReport(){
        System.out.println("\nPatient Id : "+ patientId + "\nname : "+ name + "\ntest average result "+getAverageResult()+"\ncritical value "+hasCriticalValue());
    }
    public static void main(String[] args) {
        Patient p1 = new Patient(6, "Guru Subhash", new double[]{10.32,10.332,239.23,29.2,31.2});
        Patient p2 = new Patient(12, "irawsenang", new double[]{10.32,10.332,239.23,29.2,31.2});
        Patient p3 = new Patient(24, "Aakash", new double[]{10.32,10.332,239.23,29.2,31.2});

        Patient patients[]={p1,p2,p3};
        for(Patient patient:patients) patient.displayPatientReport();
    }
}
