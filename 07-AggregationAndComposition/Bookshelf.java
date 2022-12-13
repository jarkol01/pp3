import java.util.ArrayList;

public class Bookshelf {
    private ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayContent() {
        for (Book i : books) {
            System.out.println(i.getTitle());
        }
    }
    public static void main(String[] args) {
        Writer w1 = new Writer("Marcin", "Kowalski", 18);
        Bookshelf bs1 = new Bookshelf();
        Book b1 = new Book("Harry Potter", 555, w1, "fantasy");
        Book b2 = new Book("W krainie OZ", 200, w1, "fantasy");

        bs1.addBook(b1);
        bs1.addBook(b2);
        bs1.displayContent();
        bs1.removeBook(b1);
        bs1.displayContent();
    }
}