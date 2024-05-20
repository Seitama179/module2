package MiniTest;

public class FictionBook extends Book {
    private String category;

    public FictionBook() {
    }
    public FictionBook(String bookCode, String bookName, double price, String author, String category) {
        super(bookCode, bookName, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getAmount() {
        return super.getPrice() * 0.97;
    }
}
