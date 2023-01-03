public class Main {
    public static void main(String[] args) {
        TV t1 = new TV();

        t1.displayInfo();

        t1.on();

        t1.displayInfo();

        t1.setChannel(50);
        t1.displayInfo();

        t1.setChannel(110);
        t1.displayInfo();

        t1.off();
        t1.displayInfo();
    }

}
