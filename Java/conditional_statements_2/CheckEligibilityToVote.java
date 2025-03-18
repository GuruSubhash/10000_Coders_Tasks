
public class CheckEligibilityToVote {
    
   public boolean canVote(int var1) {
    if(var1>=18) return true;
    else return false;
    
 }

 public static void main(String[] var0) {
    CheckEligibilityToVote var1 = new CheckEligibilityToVote();
    System.out.println("Can vote (Age 20)? " + var1.canVote(20));
 }
}
