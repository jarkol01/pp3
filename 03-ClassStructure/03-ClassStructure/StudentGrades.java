public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
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
        double[] amandaGrade = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades u1 = new StudentGrades("Amanda", amandaGrade);
        u1.displayRecord();
        
        double[] JamesGrade = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades u2 = new StudentGrades("James", JamesGrade);
        u2.displayRecord();
    }
}
