
public class VowelOrConsonant {
    public String isVowel(char ch){
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
            return "vowel";
        }
        else return " constant";
    }
    public static void main(String[] args) {
        VowelOrConsonant vc = new VowelOrConsonant();
        System.out.println("is a vowel/constant : " + vc.isVowel('a'));
        
    }
}
