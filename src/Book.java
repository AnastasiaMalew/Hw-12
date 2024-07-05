public class Book {

    private String nameBook;
    private int date;
    private Author author1;

    public Book(String nameBook, int date, Author author1) {
        this.nameBook = nameBook;
        this.date = date;
        this.author1 = author1;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getDate() {
        return this.date;
    }
    public String getAuthor() {
        return Author.author1;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
