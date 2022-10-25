
/**
 * A class representing smartphone with five attributes and three behaviors
 */
public class Smartphone
{
    String IMEI;
    String model;
    boolean hasCamera;
    int cameraMpx;
    double price;

    public void cameraInfo() {
        if (hasCamera == true) {
            System.out.println("Smartphone has a " + cameraMpx + "Mpx camera");
        }else {
            System.out.println("Smartphone doesn't have a camera");
        }
    }
    public void priceInfo() {
        if (price > 1500) {
            System.out.println("Smartphone is expensive");
        }else {
            System.out.println("Smartphone is cheap");
        }
    }
    public void displayInfo() {
        System.out.println("This smartphone is a " + model + " with IMEI: " + IMEI);
    }
    
    public static void main(String[] args) {
        Smartphone p1 = new Smartphone();
        p1.IMEI = "3259812456572";
        p1.model = "Samsung S20";
        p1.hasCamera = true;
        p1.cameraMpx = 48;
        p1.price = 2399.99;
        
    }
}
