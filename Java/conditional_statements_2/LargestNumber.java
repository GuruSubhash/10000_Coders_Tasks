public class LargestNumber {
    public String findLarge(int a, int b, int c){
        if(a==b && a==c) return "All are equal";
        else {
        if(a>=b && a>=c){
            if(a==b) return "A, B are large numbers";
            else {
                if(a==c) return "A,C are large numbers";
                else return "A is largest number";
            }
        }
        else{
            if(b>a && b>c){
                if(b==a) return "A, B are large numbers";
                else{
                    if(b==c) return "B, C are large numbers";
                    else return "B is largest number";
                }
            }
            else {
                if(c==a) return "A,C are large numbers";
                else{
                    if(c==b) return "B,C are large numbers";
                    else return "C is largest number";
                }
            }
            
        }
    }
    }

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        System.out.println(" largest number is : "+ ln.findLarge(6, 12, 12) );
        
    }
}