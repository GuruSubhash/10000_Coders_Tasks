import java.util.function.Consumer;
import java.util.function.Function;

public class Task5 {
    static void isPositive(Float f) {
        System.out.println((f>0) ?"Positive ":"Negative");
    }
    public static void main(String[] args) {
        Consumer<Float> cons= a-> isPositive(a);
        cons.accept(12.6f);
    }
}
