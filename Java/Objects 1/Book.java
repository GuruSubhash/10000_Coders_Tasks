
public class Book {

    static String libraryName="City public library";
    String title;
    String author;
    public static String getLibraryName() {
        return libraryName;
    }
    public static void setLibraryName(String libraryName) {
        Book.libraryName = libraryName;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void displayDetails() {
        System.out.println("Book [title=" + title + ", author=" + author +  ",  libraryName= "+ libraryName + "]");
    }
    public static void main(String[] args) {
        Book  b= new Book();
        b.setAuthor("guur Subhash");
        b.setTitle("Life");

        b.displayDetails();
    }
}
