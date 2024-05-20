package MiniTest;

public abstract class Book {
    private String bookCode;
    private String bookName;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String bookCode, String bookName, double price, String author) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }
    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract double getAmount();
}
