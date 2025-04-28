import java.util.function.Predicate;
public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> pred= a-> a%2==0;
        System.out.println((pred.test(6) ? "Even number ": "Odd number"));
    }
}
