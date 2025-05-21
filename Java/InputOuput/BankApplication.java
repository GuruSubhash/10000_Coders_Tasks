import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


class InvalidAmountException extends Exception{
    InvalidAmountException(String msg){
        super(msg);
    }
}



class InsufficientFundException extends Exception{
    InsufficientFundException(String msg){
        super(msg);
    }
}







public class BankApplication {
    static private String User;
    static private String pass;
    static private Double balance;
    static boolean adminLogin=false;
    static boolean login=false;
    public static String getUser() {
        return User;
    }
    public static void setUser(String user) {
        User = user;
    }
    public static String getPass() {
        return pass;
    }
    public static void setPass(String pass) {
        BankApplication.pass = pass;
    }
    public static Double getBalance() {
        return balance;
    }
    public static void setBalance(Double balance) {
        BankApplication.balance = balance;
    }


    static void displayAllUsers(){
        String s=getData().toString();
        String []pair=s.split(",");
        if(pair.length==0) System.out.println("No User regisitered...");
        else for(String str:pair) System.out.println(str);
    }


    static void storeData(FileOutputStream fos, Scanner sc) throws IOException{
        System.out.print("\nEnter a Username : ");
        String str= sc.nextLine().trim().replace(":", "").replace(",", "");
        int num=0;
        while(num==0){
            System.out.print("\nEnter a Password : ");
            try{
                num=Integer.parseInt(sc.nextLine().trim());
            }
            catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        double bal=0.0;
        while(bal<=0){
            System.out.print("\nEnter Initial Balance : ");
            try{
                bal = Double.parseDouble(sc.nextLine().trim());
                if(bal<0) System.out.println("You have entered negative number...");
            }
            catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        String s=str+":"+num+":"+bal+",";
        StringBuilder sb=getData();
        if(!sb.toString().contains(str)){
            fos.write(s.getBytes());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("\nSuccesfully Registered");
        }
        else System.out.println("User is already available... Try to Login\n");
    }


    static void readAndValidate( Scanner sc) throws IOException {
        System.out.println("\nEnter Username : ");
        String  userName= sc.nextLine().trim().replace(":", "").replace(",", "");
        int  pass=0;
        while(pass==0){
            System.out.println("\nEnter Password : ");
            try{
                pass = Integer.parseInt(sc.nextLine().trim());
            }
            catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        StringBuilder sb=getData();
        String[] pair=sb.toString().split(",");
        for(String str:pair){
            String[] values=str.split(":");
            if(userName.equals(values[0]) ){
                if( pass==Integer.valueOf(values[1])){
                    setUser(values[0]);
                    setPass(values[1]);
                    try{
                        setBalance(Double.parseDouble(values[2]));
                    }
                    catch(NumberFormatException e){
                        e.printStackTrace();
                    }
                    login=true;
                    // System.out.println("User : "+getUser()+"\nPass : "+getPass()+"\nBalance : "+getBalance()+"\n");
                    System.out.println("Login Successfully...");
                    if(userName.equals("Subhash") && pass==123456){
                        adminLogin=true;
                        System.out.println("Loggin as Admin successfully...");
                    }
                    return;
                }
                else {
                    System.out.println("Password wrong ...Try again...");
                    return;
                }
            }
        }
        System.out.println("User not registered...");
    }


    static void delete(Scanner sc) throws IOException {
        System.out.print("Enter Username to delete : ");
        String userName=sc.nextLine().trim().replace(":", "").replace(",", "");
        if(userName.equals("Subhash")){
            System.out.println("...Not possible to delete Admin Subhash...");
            return;
        }
        String data = getData().toString();
        if(! data.contains(userName+":")){
            System.out.println("User is not available...");
            return;
        }
        StringBuilder result= new StringBuilder("");
        String[] pair =data.split(",");
        for(String s:pair){
            String values[]=s.split(":");
            if(! values[0].equals(userName)) result.append(s).append(",");
        }
        try(
            FileOutputStream fos= new FileOutputStream("C:\\sample\\User.txt");
        ){
            fos.write(result.toString().getBytes());
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }


    static void deposit(Scanner sc) throws InvalidAmountException,IOException {
        System.out.print("\nEnter an Amount to Deposit : ");
        double amount =0.0;
        try{
             amount=Double.parseDouble(sc.nextLine().trim());
            
            StringBuilder sb1=getData();
            try(
                FileOutputStream fos= new FileOutputStream("C:\\sample\\User.txt");
            ){
                if(amount<=0){
                    throw new InvalidAmountException("Amount must be greater than Zero!..");
                }
                else{
                    setBalance(getBalance()+amount);
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    StringBuilder result = new StringBuilder("");
                    String[] pair =sb1.toString().split(",");

                    for(String s: pair){
                        String[] values=s.split(":");
                        if(values[0].equals(getUser())){
                            values[2]=String.valueOf(getBalance());
                        }
                        result.append(values[0]+":"+values[1]+":"+values[2]+",");
                    }
                    fos.write(result.toString().getBytes());
                    System.out.println("Updated Balance is : "+getBalance());
                }
            }
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
    static void WithDraw(Scanner sc) throws InvalidAmountException, InsufficientFundException , IOException{
        if(getBalance()>0){
            System.out.print("\nEnter Withdrawal amount : ");
            double amount;
            try{
                amount=Double.parseDouble(sc.nextLine().trim());
                if(amount<=0) throw new InvalidAmountException("Zero or Negative Amount not allowed");
                System.out.println();
                StringBuilder sb1=getData();
                if(balance-amount>0){
                    try(
                    FileOutputStream fos= new FileOutputStream("C:\\sample\\User.txt");
                    ){
                        setBalance(getBalance()-amount);
                        try{
                            Thread.sleep(1000);
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        StringBuilder result=new StringBuilder("");
                        String []pair=sb1.toString().split(",");
                        for(String s:pair){
                            String [] values=s.split(":");
                            if(values[0].equals(getUser())){
                                values[2]=String.valueOf(getBalance());
                            }
                            result.append(values[0]+":"+values[1]+":"+values[2]+",");
                        }
                        fos.write(result.toString().getBytes());
                        System.out.println("Updated Balance is : "+getBalance());
                    }

                }
                else{
                    throw new InsufficientFundException("WithDrawal Amount is greater than balance");
                }
            }
            catch(NumberFormatException |NullPointerException e){
                e.printStackTrace();
            }
        }
        else {
            throw new InvalidAmountException("Insufficient balance...");
        }
    }
    
    static StringBuilder getData() {
        int n;
        StringBuilder str=new StringBuilder("");
        try(
        FileInputStream fs=new FileInputStream("C:\\sample\\User.txt"); 
        ){
            try{
                while ((n=fs.read())!=-1) {
                    str.append((char)n);
                }
                return str;
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }

    static void deleteAllUsers() throws IOException {
        String str=getData().toString();
        String [] pair=str.split(",");
        StringBuilder result=new StringBuilder("");
        for(String s:pair){
            String [] values=s.split(":");
            if(values[0].equals("Subhash")){
                result.append(s).append(",");
            }
        }
        try(
            FileOutputStream fos= new FileOutputStream("C:\\\\sample\\\\User.txt");
        ){
            fos.write(result.toString().getBytes());
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File f=null;
        try{
            f=new File("C:\\sample\\User.txt");
            f.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        if(f.exists()){
            System.out.println("File Created...");
            if(f.canRead()) System.out.println("File have read permissions...");
            else {
                Path path = Paths.get("C:\\sample\\User.txt");
                 Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
                try{
                    Files.setPosixFilePermissions(path, perms);
                }
                catch(IOException e){
                    e.printStackTrace();
                }

                System.out.println("Updated file permissions.");
            
            }
        }
        try(
            Scanner sc=new Scanner(System.in);
            FileOutputStream fos= new FileOutputStream("C:\\sample\\User.txt",true);
        ){
            getData();
            System.out.println("\n------Welcome to the bank------\n");
            while(true){
                if(!login) {
                    System.out.println("1.Login \n 2.Registration \n 3.Exit \n");
                    System.out.print("Choose one option [1-3] : ");
                    int n;
                    try{
                        n=Integer.parseInt(sc.nextLine().trim());
                        System.out.println();
                        if(n==1){
                            try{
                                readAndValidate(sc);
                            }
                            catch(IOException e){
                                e.printStackTrace();
                            }
                        }
                        else if(n==2){
                            try{
                                storeData(fos, sc);
                            }
                            catch(IOException e){
                                e.printStackTrace();
                            }
                        }
                        else if(n==3){
                            System.out.println("ThanQ for using...\n");
                            break;                                                   //
                        }
                        else System.out.println("Invalid Option");
                    }
                    catch(NumberFormatException e){
                        e.printStackTrace();
                    }
                }
                else{
                    if(adminLogin){
                        System.out.println("\n------------Admin Operations----------");
                        System.out.println("1.List Users \n2.Delete Specific User \n3.Delete All Users \n4.Logout");
                        System.out.print("Choose Option[1-4] : ");
                        int n=0;
                        try{
                            n=Integer.parseInt(sc.nextLine().trim());
                            System.out.println();
                            if(n==1){
                            displayAllUsers();
                        }
                        else if(n==2){
                            try{
                                delete(sc);
                            }
                            catch(IOException e){
                                e.printStackTrace();
                            }
                        }
                        else if(n==3) {
                            try{
                                deleteAllUsers();
                            }
                            catch(IOException e){
                                e.printStackTrace();
                            }
                        }
                        else if(n==4){
                            login=false;
                            adminLogin=false;
                            setBalance(null);
                            setUser(null);
                            setPass(null);
                        }
                        else System.out.println("Invalid Option...");
                        }
                        catch(NumberFormatException e){
                            e.printStackTrace();
                        }
                    }
                    else{    
                        System.out.println("\nBanking Operations");
                        System.out.println("------------------------------");
                        System.out.println("\n1.Deposit \n2.WithDraw \n3.CheckBalance \n4.LogOut");
                        System.out.print("Choose one option [1-4] : " );
                        int n=0;
                        try{
                            n=Integer.parseInt(sc.nextLine().trim());
                            System.out.println();
                            if(n==1){
                                try{
                                    deposit(sc);
                                }
                                catch(InvalidAmountException | IOException e){
                                    e.printStackTrace();
                                }
                            }
                            else if(n==2){
                                try{
                                    WithDraw(sc);
                                }
                                catch(InsufficientFundException | InvalidAmountException |IOException e){
                                    e.printStackTrace();
                                }
                            }
                            else if(n==3){
                                System.out.println("Balance is : "+ getBalance());
                            }
                            else if(n==4){
                                login=false;
                                setBalance(null);
                                setUser(null);
                                setPass(null);
                            }
                            else System.out.println("Invalid Option");
                            }
                            catch(NumberFormatException e) {
                                e.printStackTrace();
                            }
                        }
                }
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
