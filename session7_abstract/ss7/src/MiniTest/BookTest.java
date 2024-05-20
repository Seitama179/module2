package MiniTest;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("001", "javascript", 100000.0, "CodeGym", "javascript", "abc");
        books[1] = new ProgrammingBook("002", "java 01", 120000.0, "CodeGym", "java", "abc");
        books[2] = new ProgrammingBook("003", "java 02", 130000.0, "CodeGym", "java", "abc");
        books[3] = new FictionBook("004", "Doraemon", 50000.0, "Fujio.F.Fujiko", "Science-Fiction");
        books[4] = new FictionBook("005", "James Bond", 200000.0, "Ian Fleming", "Detective");
        books[5] = new FictionBook("006", "Harry Potter", 200000.0, "J.K. Rowling", "Fantasy");
        double totalAmount = 0;
        for (int i = 0; i < books.length; i++) {
            totalAmount = totalAmount + books[i].getAmount();
        }
        int javaCount = 0;
        System.out.println("Tong gia tien: " + totalAmount + " VND");
        for (Book book : books ) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook pb = (ProgrammingBook) book;
                String language = pb.getLanguage();
                if (language.equals("java")) {
                    javaCount ++;
                }
            }
        }
        System.out.println("So sach Programming co ngon ngu java: " + javaCount);
    }
}