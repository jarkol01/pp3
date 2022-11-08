public class Person{
    static String name;
    double weight;
    int height;
    double BMI;
    
    public Person(String name, double weight, int height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
    };
    
    public void setWeightAndHeight(double newWeight, int newHeight)
    {
        this.weight = newWeight;
        this.height = newHeight;
    };
    
    public void calculateBMI()
    {
        this.BMI = (weight / height / height) * 10000;
    };
    
    public void displayRecord()
    {
        System.out.println(this.name);
        System.out.println(this.weight);
        System.out.println(this.height);
        System.out.println(this.BMI);
        
        if (BMI < 18.5) {
            System.out.println("BMI too low");
        }else if (BMI > 24.9) {
            System.out.println("BMI too high");
        }
    };
};