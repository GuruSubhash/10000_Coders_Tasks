
public class CheckDivisibilityBy5 {
    public boolean isDivisibleBy5(int num){
        if(num%5==0) return true;
        return false;
    }
    public static void main(String[] args) {
        CheckDivisibilityBy5 cd5 = new CheckDivisibilityBy5();
        System.out.println("Is 15 divisible by 5? " + cd5.isDivisibleBy5(15));
    }
}
