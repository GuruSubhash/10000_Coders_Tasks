
public class DivisibilityCheck5$11 {
    public String isDivisibleBy5and11(int num){
        if(num %5==0 && num%11==0) return "Divisible";
        else return "not Divisible";
    }
    public static void main(String[] args) {
        DivisibilityCheck5$11 d = new DivisibilityCheck5$11();
        System.out.println("is 55 divisible by both 5 and 11 : "+ d.isDivisibleBy5and11(55) );
    }
}
