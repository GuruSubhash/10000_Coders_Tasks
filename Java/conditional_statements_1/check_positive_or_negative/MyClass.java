
public class MyClass {
    public String isPositive(int a){
        if(a>0) return "Positive";
        if(a<0) return "Negative";
        return "Zero";
    }
    public static void main(String[] args) {
        MyClass mc= new MyClass();
    System.out.println("is 6 positive : "+mc.isPositive(6));
    }
}
