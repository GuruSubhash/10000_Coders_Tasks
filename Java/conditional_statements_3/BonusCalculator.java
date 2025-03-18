
public class BonusCalculator {
    public double caluclateBonus(int experience, int rating, double salary){
        if(experience>5 && rating >9)return 0.5*salary;
        else if(experience>3 && rating>7) return 0.3*salary;
        else if(experience>1 && rating>5) return 0.1*salary;
        else return 0;
    }
    public static void main(String[] args) {
        BonusCalculator bc = new BonusCalculator();
        System.out.println("calculate bonus : "+ bc.caluclateBonus(6, 7, 100000) );
        
    }
}
