public class Handling {
    static void timethod( int a ){
        try{
            System.out.println("10000");
            ti1method(a);
        }
        catch(Exception e){
            e.getMessage();
        }
        finally{
            System.out.println("Finally");
        }
    }
    static void ti1method(int a){
        if(a==0) throw new ArithmeticException("/ by Zero");
    }
}
