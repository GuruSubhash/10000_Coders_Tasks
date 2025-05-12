import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        String address=sc.nextLine();
        long phNumber=Integer.parseInt(sc.nextLine());
        double balance=Double.parseDouble(sc.nextLine());
        BankApplication b= new BankApplication(name, address, phNumber, balance);
        while (true) {
            System.out.println("**** Select an Option from Below ****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your option [1-4]: ");
            int k=Integer.parseInt(sc.nextLine());
            if(k==1) {
                System.out.print("Enter your withdrawal amount: ");
                b.withDraw(Double.parseDouble(sc.nextLine()));
                System.out.println();
                continue;
            }
            else if(k==2){
                System.out.println("Enter deposit money: ");
                b.deposit(Double.parseDouble(sc.nextLine()));
                System.out.println();
                continue;
            }
            else if(k==3){
                b.showBalance();
                continue;
            }
            else if(k==4){
                System.out.println("Thank You! ");
                break;
            }
            else System.out.println("Invalid option ");
        }
    }
}
