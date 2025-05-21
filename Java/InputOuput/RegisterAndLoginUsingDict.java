import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegisterAndLoginUsingDict {
    static Hashtable<String, Integer> dict = new Hashtable<>();
    static StringBuilder sb=new StringBuilder("");
    static boolean adminLogin;
    static void collectData(FileInputStream fis) throws IOException{
        int i;
        while((i=fis.read())!=-1){
            sb.append((char)i);
        }
        // System.out.println(sb);
        for (String pair : sb.toString().split(",")) {
            // System.out.println(pair);
            String[] keyValue = pair.split("=");
            // System.out.println(Arrays.toString(keyValue));
            try{
                dict.put(keyValue[0], Integer.parseInt(keyValue[1]));
            }
            catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
            catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
    }
    static void storeData(FileOutputStream fos, Scanner sc) throws IOException{
        System.out.print("\nEnter a Username : ");
        String str= sc.nextLine();
        System.out.print("\nEnter a Password : ");
        int num=Integer.parseInt(sc.nextLine().trim());
        System.out.println();
        str=str.trim();
        
        String s=","+str+"="+num;
        fos.write(s.getBytes());
        dict.put(str,Integer.valueOf(num));
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(dict.toString());
        System.out.println("Succesfully Registered");
    } 
    static void readAndValidate(FileInputStream fis, Scanner sc) throws IOException{
        System.out.println("\nEnter Username : ");
        String  userName= sc.nextLine().trim();
        System.out.println("\nEnter Password : ");
        int  pass=0;
        try{
            pass = Integer.parseInt(sc.nextLine().trim());
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
        // int i;
        // while((i=fis.read())!=-1){
        //     sb.append((char)i);
        // }
        
        
        if(dict.containsKey(userName) && (dict.get(userName)==pass)){
            System.out.println("\nUser credentials are valid...");
        }
        else{
            System.out.println("User Credentials are invalid...\nRgister and try again...");
        }
        
        if(userName.equals("Subhash") && pass==123456){
            adminLogin=true;
            System.out.println("Loggin as Admin successfully...");
        }
        // System.out.println(sb);
    }
    static void delete(FileOutputStream fos, Scanner sc) throws IOException {
        System.out.print("\nEnter username to delete : ");
        String userDel=sc.nextLine().trim();
        if(!dict.containsKey(userDel)) System.out.println("User not Available...");
        else if(userDel.equals("Subhash")) System.out.println("Not possible to delete admin datails...");
        else {
            dict.remove(userDel);
            String result = dict.entrySet()
                           .stream()
                           .map(entry -> entry.getKey() + "=" + entry.getValue())
                           .collect(Collectors.joining(","));
        System.out.println(result);
        fos.write(result.getBytes());
        }
        
        // System.out.println(dict);
    }
    public static void main(String[] args) {
        System.out.println(dict);
        File f=new File("C:\\sample\\User.txt");
        try{
            f.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        if(f.exists())System.out.println("File Created...");
        Scanner sc=new Scanner(System.in);
        FileInputStream fis=null;
        try{
            fis= new FileInputStream("C:\\sample\\User.txt");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        // System.out.println(fis==null);
            try{
                collectData(fis);
                }
            catch(IOException e){
                e.printStackTrace();
            }
        System.out.println(dict);
        FileOutputStream fos=null;
        FileOutputStream fos2=null;
        try{
            fos= new FileOutputStream("C:\\sample\\User.txt",true);
            fos2= new FileOutputStream("C:\\sample\\User.txt");
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // System.out.println(fos==null);
        while(true){
            System.out.println("------Welcome to the bank------");
            System.out.println("1.Login");
            System.out.println("2.Registration");
            System.out.println("3.Exit");
            if(adminLogin)System.out.println("4.Delete");
            System.out.print("choose onr option [1-3] : ");
            int n=Integer.parseInt(sc.nextLine().trim());
            if(n==1){
                try{
                    readAndValidate(fis,sc);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            else if(n==2){
                try{
                    storeData(fos,sc);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            else if(n==3){
                System.out.println("ThanQ for using...");
                System.exit(0);
            }
            else if(n==4){
                if(adminLogin)try{
                    delete(fos2, sc);
                    collectData(fis);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                else System.out.println("Login as Admin");
            }
            else System.out.println("Invalid Option");
        }
    }
}
