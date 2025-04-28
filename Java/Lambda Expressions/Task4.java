import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> func = s->s.length();
        System.out.println("String length is : "+func.apply("Subhash"));
    }
}
