public class Student {
    
    //wykaz atrybutów
    String name;
    int age;
    String studentCardID;
    boolean isCardValid;
    String semesterNumber;
    double averageGrade;
    
    //wykaz metod
    public void sayHello() {
        System.out.println("Hello");
    }
    public void displayName() {
        System.out.println("My name is " + name);
    }
    public void displayAge() {
        System.out.println("My age is " + age);
    }
    public void displayInfo() {
        System.out.println(name + " " + semesterNumber + " " + averageGrade);
    }
    public void changeStatus() {
        if(isCardValid == true){
            isCardValid = false;
        }else{
            isCardValid = true;
        }
    }
    public void displayInfo2() {
        System.out.println(name + " " + studentCardID + " " + isCardValid);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jarek";
        s1.age = 20;
        s1.semesterNumber = "2312";
        s1.averageGrade = 4.5;
        s1.studentCardID = "12345";
        s1.isCardValid = true;
        
        s1.displayInfo2();
        s1.changeStatus();
        s1.displayInfo2();
    }
}