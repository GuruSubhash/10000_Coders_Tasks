
public class PositiveOrNegative {
    public String isPositive(int num){
        if(num>0) return "Positive";
        else if (num<0) return "Negative";
        else{return "Zero";}
    }
    public static void main(String[] args) {
        PositiveOrNegative pn= new PositiveOrNegative();
        System.out.println("is 6 Positive number : "+ pn.isPositive(6));
    }
}
