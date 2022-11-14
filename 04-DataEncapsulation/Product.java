class Product {
    private String name;
    private boolean isVegetarian;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    public String toString() {
        return getName() + " vege: " + isVegetarian();
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Jabłko";
        p1.isVegetarian = true;

        System.out.println(p1);
    }
}