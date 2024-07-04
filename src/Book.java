public class Book {
    String nameBook;
    int date;
    String author;

    public Book(String nameBook, int date, String author) {
        this.nameBook = nameBook;
        this.date = date;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getDate() {
        return this.date;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
