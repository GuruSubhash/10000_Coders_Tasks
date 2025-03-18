
public class UniversityAdmission {
    public String evaluateAdmission(int marks, boolean sportsAcheivement){
        if(marks>=95) return "Admitted with Scholorship";
        else if(marks>84) return "Admitted without Scholorship";
        else if(marks> 70 && sportsAcheivement) return "Admitted under sports quata";
        else if(marks >69 ) return "Interview required ";
        else return "Admission rejected";
        }
    public static void main(String[] args) {
        UniversityAdmission ua = new UniversityAdmission();
        System.out.println("is student eligiible for admission with 71 marks and no sportsAcheivement :  "+ ua.evaluateAdmission(71, false));
    }
}
