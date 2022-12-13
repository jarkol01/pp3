public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int s, int maxSpeed) {
        super(s);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        return new int[]{getSeats(), maxSpeed};
    }

    
}
