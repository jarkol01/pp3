public class SuperCounter extends Counter{
    public SuperCounter(int count) {
        super(count);
    }

    public void addN(int n) {
        for (int i = 0; i<n; i++) {
            add1();
        }
    }

}
