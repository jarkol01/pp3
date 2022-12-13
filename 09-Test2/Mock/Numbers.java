import java.util.Arrays;

public class Numbers {
    int first;
    int second;
    int third;
    int fourth;
    int fifth;
    
    public Numbers(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
    }

    public boolean different() {
        int[] arri = {first, second, third, fourth, fifth};
        Arrays.sort(arri);
        for (int i = 0; i<arri.length-1; i++) {
            if (arri[i] == arri[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(9,7,4,3,8);
        System.out.println(n1.different());

    }
    
}
