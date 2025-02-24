
public class Library {
 
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookId(666);
        b1.setTitle("Diary...");
        b1.setAuthor("Writer");
        b1.setPrice(100);
        System.out.println("Book id : "+b1.getBookId()+"\nTitle : "+ b1.getTitle()+"\nAuthor : "+ b1.getAuthor()+"\nPrice : "+b1.getPrice());
    }
}
