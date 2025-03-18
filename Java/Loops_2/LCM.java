
public class LCM {
    public static int findLCM(int a, int b){
        int greatest =(a>b)?a:b;
        int lcm=greatest;

        System.out.println(lcm);
        while(true){
            if(lcm%a==0 && lcm %b==0){
                break;
            }
            else{
                lcm+=greatest;
            }
        }
        return lcm;
    }
    public static int findLCM(int a, int b, int c){
        int greatest;
        if(a>=b && a>=c) greatest=a;
        else if(b>=a&& b>=c) greatest=b;
        else greatest =c;

        int lcm=greatest;

        System.out.println(lcm);
        while(true){
            if(lcm%a==0 && lcm %b==0 && lcm %c==0){
                break;
            }
            else{
                lcm+=greatest;
            }
        }
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println(findLCM(10,25 ));
        System.out.println();
        System.out.println(findLCM(10, 12, 15));
        
    }
}
