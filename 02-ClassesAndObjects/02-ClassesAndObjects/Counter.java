
/**
 * A class representing bank account with five attributes and three behaviors
 */
public class Counter
{
    int count = 0;

    public void plusOne() {
        count++;
        System.out.println("Count: " + count);
    }
    public void minusOne() {
        count--;
        System.out.println("Count: " + count);
    }
    public void plusTen() {
        count += 10;
        System.out.println("Count: " + count);
    }
    public void minusTen() {
        count -= 10;
        System.out.println("Count: " + count);
    }
    public void reset() {
        count = 0;
        System.out.println("Count: " + count);
    }
}
