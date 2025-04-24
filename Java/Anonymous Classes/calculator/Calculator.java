@FunctionalInterface
public interface Calculator {

    int add(int a, int b);
    public static void main(String[] args) {
        Calculator calc = new Calculator(){
            public int add(int a, int b){
                return a+b;
            }
        };
        System.out.println(calc.add(10, 20));
    }
}
