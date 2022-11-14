import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        Random random = new Random();
        grades = new double[numberOfGrades];
        double[] possibleGrades = {2.0, 3.0, 3.5, 4.0, 4.5, 5.0};
        for (int i = 0; i < grades.length; i++) {
            this.grades[i] = possibleGrades[random.nextInt(6)];
        }
        
    }
    StudentGrades(String name) {
        Scanner scan =  new Scanner(System.in);
        int i = 0;
        System.out.println("Ile ocen chcesz wpisać? ");
        int numberOfGrades = scan.nextInt();
        grades = new double[numberOfGrades];
        for (int x = 0; i < grades.length; i++) {
            System.out.println("Wpisz pojedyńczą ocenę: ");
            grades[i] = scan.nextDouble();
        }
    }
    
    public double calculateLowestGrade() 
    {
        double min = grades[0];
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
    
    public double calculateHighestGrade() 
    {
        double max = grades[0];
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }
    
    public int calculateNumberOfGrades() 
    {
        return grades.length;
    }
    
    public double calculateGradeAverage() 
    {
        double sum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
    
    public void displayRecord() 
    {
        System.out.println(studentName);
        System.out.println(grades);
        System.out.println(calculateNumberOfGrades());
        System.out.println(calculateLowestGrade());
        System.out.println(calculateHighestGrade());
        System.out.println(calculateGradeAverage());
    }
    
    public static void main(String[] args) 
    {
        /*double[] amandaGrade = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades u1 = new StudentGrades("Amanda", amandaGrade);
        u1.displayRecord();
        
        double[] JamesGrade = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades u2 = new StudentGrades("James", JamesGrade);
        u2.displayRecord();*/
        
        StudentGrades u3 = new StudentGrades("Jarek", 8);
        u3.displayRecord();
    }
}
