
public class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    void setAccountNumber(long accNum){
        accountNumber=accNum;
    }
    void setAccountHolderName(String accName){
        accountHolderName=accName;
    }
    void setBalance(double bal){
        balance=bal;
    }

    long getAccountNumber() {
        return accountNumber;
    }
    String getAccountHolderName() {
        return accountHolderName;
    }
    double getBalance(){
        return balance;
    }
}
