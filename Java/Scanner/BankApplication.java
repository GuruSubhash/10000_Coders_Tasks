public class BankApplication {
    String customerName;
    String customerAddress;
    long phoneNumber;
    double balance;
    @Override
    public String toString() {
        return "BankApplication [customerName=" + customerName + ", customerAddress=" + customerAddress
                + ", phoneNumber=" + phoneNumber + ", balance=" + balance + "]";
    }
    public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        System.out.println("Account Created Successfully");
    }
    void showBalance(){
        System.out.println("Your balance is : "+balance);
    }
    void deposit(double amount){
        if(amount>0) {
            balance+=amount;
            System.out.println("Deposit success, available balance: "+balance);
        }
        else
        System.err.println("deposit amount is negative or zero");
    }
    void withDraw(double amount){
        if(amount<1) System.err.println("Invalid withdrawal amount");
        else if(balance-amount>0) {
            balance-=amount;
            System.out.println("Withdrawal successful, remaining balance: "+balance);
        }
        else{
            System.out.println("Insufficient Funds!");
        }
    }
}
