import java.util.function.Supplier;
public class Task2 {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "Processing complete";
        System.out.println(sup.get());
    }
}
