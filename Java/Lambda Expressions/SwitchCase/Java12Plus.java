import java.util.function.Function;
import java.util.function.Consumer;
 public class Java12Plus {

    public static void main(String[] args) {
        String input = "B";

        // Using switch expression to return a Function<String, String>
        Function<String, String> transformer = switch (input) {
            case "A" -> s -> s.toUpperCase(); // Lambda for uppercase
            case "B" -> s -> s.toLowerCase(); // Lambda for lowercase
            default -> Function.identity();   // Default: no change
        };

        System.out.println(transformer.apply("Hello")); // Output: "hello"

        // Using switch expression to return a Consumer<String>
        Consumer<String> logger = switch (input) {
            case "A" -> System.out::println; // Uses method reference
            case "B" -> s -> System.out.println(s.length()); // Custom lambda
            default -> s -> System.out.println("Default");
        };

        logger.accept("Java"); // Output: 4 (length of "Java")
    }
}

