
public class CheckElegibilityToVote {
    public boolean canVote(int a){
        if(a>=18) return true;
        return false;
    }
    public static void main(String[] args) {
        CheckElegibilityToVote obj = new CheckElegibilityToVote();
        System.out.println("Can vote (Age 20)? " + obj.canVote(20));
    }
}
