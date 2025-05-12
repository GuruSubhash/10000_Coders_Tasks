import java.util.function.Function;

public class GroupedCases {

    public static void main(String[] args) {
        String input="h";
        Function<String, String> transformer = switch (input) {
            case "A", "B" -> s -> s.toUpperCase(); // Grouped cases
            case "C", "D" -> s -> s.toLowerCase();
            default -> s -> "Default";
        };
        System.out.println(transformer.apply(input));
    }
}