
/**
 * A class representing bank account with five attributes and three behaviors
 */
public class bankAccount
{
    String owner;
    String bank;
    boolean isBlocked;
    int howManyCards;
    double balance;

    public void checkBlocked() {
        if (isBlocked) {
            System.out.println("Your bank account is blocked, sorry.");
        }else {
            System.out.println("Your bank account isn't blocked.");
        }
    }
    public void balanceInfo() {
        if (balance > 1000) {
            System.out.println("You have a lot of money.");
        }else {
            System.out.println("You should be saving more money.");
        }
    }
    public void displayInfo() {
        System.out.println("This bank account owner is " + owner + " and bank is " + bank);
    }
}
