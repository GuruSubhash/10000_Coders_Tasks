
public class SimpleInterestCalculator {
    static double calculateSimpleInterest(double principal, double rate, double time){
        return (principal*rate*time)/100;
    }
    public static void main(String[] args) {
        double res =calculateSimpleInterest(10000, 10, 3);
        System.out.println(res);
    }
}
