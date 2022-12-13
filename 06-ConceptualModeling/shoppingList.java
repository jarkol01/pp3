import java.util.ArrayList;
import java.util.Scanner;

public class shoppingList {
    ArrayList<String> list = new ArrayList<String>();

    public void displayAmount() {
        System.out.println("Ilość rzeczy na liście: " + list.size());
    }

    public void displayList() {
        System.out.println("Rzeczy na twojej liście: ");
        for (String i : list) {
            System.out.println(i);
        }
    }

    public void addProducts(String[] add) {
        for (String i : add) {
            list.add(i);
        }
    }
    public void addFromKeyboard() {
        Scanner keybaord = new Scanner(System.in);
        list.add(keybaord.nextLine());
    }

    public static void main(String[] args) {
        shoppingList s1 = new shoppingList();

        s1.displayList();
        s1.displayAmount();
        s1.addProducts(new String[]{"Mleko", "Chleb", "Tynk"});
        s1.displayList();
        s1.displayAmount();
        s1.addProducts(new String[]{"Szynka"});
        s1.displayList();
        s1.displayAmount();
        s1.addFromKeyboard();
        s1.displayList();
        s1.displayAmount();
    }
}
