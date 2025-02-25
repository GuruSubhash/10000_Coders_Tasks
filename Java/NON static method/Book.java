
public class Book {
    String bookTitle;
    String author;
    int isbn;
    void addBookDetails(String title, String author, int isbn){
        bookTitle=title;
        this.author=author;
        this.isbn=isbn;
    }
    String displayDetails(){
        return "Book Title : "+ bookTitle+"\nAuthor : "+author+"\nisbn : "+isbn;
    }
    public static void main(String[] args) {
        Book b= new Book();
        b.addBookDetails("Java", "Subhash", 666);
        System.out.println(b.displayDetails());


    }
}
