package scr.MorningSession.Class911SOLID;
//Exercise 2:
//You have a Student class that calculates
// grades and prints report cards.
// Create separate classes for grade calculation and report card printing.
public class Student {
    String name;
    private CalculatorGrades calculatorGrades;
    private PrintReport printReport;
    public Student(String name, CalculatorGrades calculatorGrades) {
        this.name = name;
        this.calculatorGrades = calculatorGrades;

    }public String getName() {
        return name;
    }
    public char getGrade(){
        return  calculatorGrades.calculateGrade();
    };

}

class CalculatorGrades{
    double score;

    public CalculatorGrades(double score) {
        this.score = score;
    }
    public char calculateGrade(){
        if(score>=90){
            return 'A';
        }else if(score>=70){
            return 'B';
        }else if(score>=50){
            return 'C';
        }else{
            return 'D';
        }
    }
}
class PrintReport{
    public void print(Student student){
        System.out.println("Student " + student.getName() +": Grade " + student.getGrade());
    }
}
class Main1 {
    public static void main(String[] args) {

        CalculatorGrades calculator = new CalculatorGrades(60);
     Student student = new Student("Kristoff", calculator);

     PrintReport report= new PrintReport();
     report.print(student);

    }
}
