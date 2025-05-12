public class Main {

    static boolean isPrime(int num){
        for(int i=2; i*i<=num;++i){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        NumberChecker numCheck= new NumberChecker(){
            public boolean checkNumber(int num){
                return isPrime(num);
            }
        };
        int num=36;
        System.out.println( num + ((numCheck.checkNumber(num)) ? " is Prime Number" : " is not a prime number"));

        CharChecker chCheck = new CharChecker(){
            @Override
            public void checkChar(char ch){
                System.out.println( (int)ch + ((isPrime((int)ch)) ? " is Prime Number" : " is not a prime number"));
            }
        };
        char ch1='A';
        chCheck.checkChar(ch1);
    }
}