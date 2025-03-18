
public class EvenOrOdd {
    public boolean isEven(int num){
        if(num%2==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        EvenOrOdd eo = new EvenOrOdd();
        System.out.println("is 6 even : "+eo.isEven(6));
    }
}
