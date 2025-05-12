import java.util.function.Function;

public class Java8 {
  
    public static void main(String[] args) {
        String input = "A";
        Function<String, String> transformer = getTransformer(input);
        System.out.println(transformer.apply("Hello")); // Output: "HELLO"
    }

    public static Function<String, String> getTransformer(String input) {
        switch (input) {
            case "A":
                return s -> s.toUpperCase(); // Lambda for uppercase
            case "B":
                return s -> s.toLowerCase(); // Lambda for lowercase
            default:
                return Function.identity();  // Default: no change
        }
    }
}

