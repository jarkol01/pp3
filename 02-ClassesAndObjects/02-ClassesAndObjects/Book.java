
/**
 * A class representing bank account with five attributes and three behaviors
 */
public class Book
{
    String title;
    String author;
    boolean isOpen = false;
    int currentPage = 0;
    int allPages;

    public void openClose() {
        isOpen = !isOpen;
    }
    public void nextPage() {
        if (currentPage != allPages) {
            currentPage++;
            System.out.println("NEXT! You are on page " + currentPage);
        }else {
            System.out.println("You are at the end of the book!");
        }
    }
    public void previousPage() {
        if (currentPage != 0) {
            currentPage--;
            System.out.println("BACK! You are on page " + currentPage);
        }else {
            System.out.println("You are at the begining of the book!");
        }
    }
}
