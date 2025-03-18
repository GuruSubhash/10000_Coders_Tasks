
public class GreatestNumber {
    public int findGreater(int num1, int num2){
        if(num1 >=num2) return num1;
        return num2;
    }
    public static void main(String[] args) {
        GreatestNumber gn = new GreatestNumber();
        System.out.println("Greater number (10, 25): "+ gn.findGreater(10,25 ));
    }
}
