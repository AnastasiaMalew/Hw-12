public class Book {

    private String nameBook;
    private int date;
    private Author Author;

    public Book(String nameBook, int date, String Author) {
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getDate() {
        return this.date;
    }
    public Author getAuthor() {
        return this.Author;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
