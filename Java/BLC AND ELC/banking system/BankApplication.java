
public class BankApplication {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.setAccountHolderName("Guru Subhash");
        b.setAccountNumber(666);
        b.setBalance(9000.000000);
        System.out.println("AccountHolderName :  "+ b.getAccountHolderName()+"\nAccountNumber : "+b.getAccountNumber() +"\nBalance : "+b.getBalance() );   
    }
}
