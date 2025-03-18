
public class InsurancePolicy {
    public String calculatePremium(int age, int experience){
        if(age>50 && experience>10) return "Lowest Premium";
        else if(age>30 && age<=50 && experience >5) return "Moderate Premiium";
        else if(age>18 && age<=30 && experience>0) return "Highest Premium";
        else return "Not Eligible for Premium";
    }

    public static void main(String[] args) {
        InsurancePolicy ip = new InsurancePolicy();
        System.out.println("caluclate premium for a person with age 51 and experience 10 :  "+ ip.calculatePremium(51, 10));
        
    }
}
