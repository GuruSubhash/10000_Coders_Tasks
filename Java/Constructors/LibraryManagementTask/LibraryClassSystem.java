import java.util.Scanner;

public class LibraryClassSystem {
 
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        Book b= new Book(66,"JAVA ", 12);
        System.out.println(b);
        while(true){
            int k=sc.nextInt();
            if(k==1) {
                System.out.println("Attempting to borrow a book...");
                b.borrowBook();
                continue;
            }
            else if(k=2) {
                System.out.println();
                b.returnBook();
                continue;
            }
            else if(k==3) {
                System.out.println("Library system transactions completed.");
                break;
            }
            }
        }
}
}
