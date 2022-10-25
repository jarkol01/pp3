
/**
 * A class representing bank account with five attributes and three behaviors
 */
public class Lamp
{
    boolean isON = false;

    public void turnON() {
        isON = true;
    }
    public void turnOFF() {
        isON = false;
    }
    public void checkState() {
        if (isON) {
            System.out.println("The lamp is ON");
        }else {
            System.out.println("The lamp is OFF");
        }
    }
}
