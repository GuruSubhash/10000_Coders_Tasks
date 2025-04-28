import java.util.function.BiFunction;

public class Task1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> pred =(a,b) ->a+b;
        System.out.println("sum is : "+ pred.apply(12,6));
    }
}
