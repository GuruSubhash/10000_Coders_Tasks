public class StringValidator {
    public static void main(String[] args) {
        String str="Name@123";
        boolean isCaps=false;
        boolean isSmall=false;
        boolean isDigit=false;
        boolean isSymbol=false;
        char []sym={'!','@','#','$','%','^','&','*'};
        for(int i=0; i<str.length();++i){
            if(isCaps && isSmall && isDigit && isSymbol) {
                System.out.println("String is valid...");
                break;
            }
            if(str.charAt(i) >='A' && str.charAt(i)<='Z' ) isCaps=true;
            if(str.charAt(i)>='a'&& str.charAt(i)<='z') isSmall=true;
            if((int)str.charAt(i) >=0 ) isDigit=true;
            for(int k=0; k<sym.length;++k){
                if(str.charAt(i)==sym[k]) {
                    isSymbol=true;
                    break;
                }
            }
        }
    }
}
