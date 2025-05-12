public class Book {
    int bookId;
    String title;
    int availableCopies;
    public Book(int bookId, String title, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.availableCopies = availableCopies;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getAvailableCopies() {
        return availableCopies;
    }
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
    
    public String toString() {
        return "bookId=" + bookId + "\ntitle=" + title + "\navailableCopies=" + availableCopies ;
    }
    void borrowBook(){
        if(availableCopies>0){
            availableCopies--;
            System.out.println("Book borrowed successfully! Updated Available Copies: "+availableCopies);
        }
        else System.out.println("Book is not available for borrowing.");
    }
    void returnBook(){
        availableCopies++;
        System.out.println("Book returned successfully! Updated Available Copies: " +availableCopies);
    }
    
}
