import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product) {
        list.add(product);
    }
    public String toString() {
        String out = "";
        for (Product i : list) {
            out += i.getName() + ",";
        }
        if (out == "") {
            return "";
        } else {
            return out.substring(0, out.length()-1);
        }
    }

    public int total() {
        int count = 0;
        for (Product i : list) {
            count += i.getQuantity();
        }
        return count;
    }
}
