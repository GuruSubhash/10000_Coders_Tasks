
public class MyClass {
    public boolean isEven(int a){
        if(a%2==0) return true;
        return false;
    }
   public static void main(String[] args) {
    MyClass mc= new MyClass();
    System.out.println("is 6 even : "+mc.isEven(6));
    
   } 
}
