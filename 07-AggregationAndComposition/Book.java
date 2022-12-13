import java.util.ArrayList;

public class Book {
    private String title;
    private int numberOfPages;
    private Writer writer;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    private String genre;
    
    public Book(String title, int numberOfPages, Writer writer, String genre) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.writer = writer;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void newChapter(int startOfChapter, int lengthInPages, String name) {
        chapters.add(new Chapter(startOfChapter, lengthInPages, name));
    }

    public void displayChapters() {
        String out = "";
        for (Chapter i : chapters) {
            out += i.name + ", ";
            
        }
        System.out.println(out);
    }

    public void displayData() {
        System.out.println(getTitle() + " " + getNumberOfPages() + " " + writer.getName() + " " + writer.getSurname() + " " + getGenre());
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Dan", "Brown", 58);
        Book b1 = new Book("Inferno", 555, w1, "Thriller");

        b1.displayData();
        b1.newChapter(50, 123, "Rozdzial trzeci");
        b1.newChapter(70, 432, "Rozdzial czwarty");
        b1.displayChapters();
    }
}
