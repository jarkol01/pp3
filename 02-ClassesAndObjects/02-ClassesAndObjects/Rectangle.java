
/**
 * A class representing bank account with five attributes and three behaviors
 */
public class Rectangle
{
    int height;
    int width;

    public void displayInfo() {
        System.out.println("This rectangle has dimensions of " + height + "x" + width);
        System.out.println("This rectangle is " + height + " in height and " + width + "in width.");
        System.out.println("This rectangle has surface area of " + height*width);
    }
}
