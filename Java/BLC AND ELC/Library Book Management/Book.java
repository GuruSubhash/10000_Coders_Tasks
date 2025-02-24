
public class Book {
    int bookId;
    String title;
    String author;
    double price;

    void setBookId(int bid){
        bookId=bid;
    }
    void setTitle(String title){
        this.title=title;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void setPrice(double price){
        this.price=price;
    }
    int getBookId(){
        return bookId;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
}
