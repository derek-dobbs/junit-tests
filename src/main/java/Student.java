import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void deleteGrade(int gradeToDelete) {
        this.grades.remove(gradeToDelete);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size() ;
    }

    public void updateGrade(int oldGrade, int newGrade) {
        this.deleteGrade(oldGrade);
        this.addGrade(newGrade);
    }

    public void displayGrades() {
        System.out.println("Here are the grades for " + this.getName() + ":");
                for (int i = 0; i < this.grades.size(); i++) {
                    System.out.println(this.grades.get(i));
                }
    }

    public static void main(String[] args) {
        Student s1 = new Student(12345, "Michael");
        Student s2 = new Student(21435, "Dwight");
        Student s3 = new Student(45312, "Jim");

        s1.addGrade(15);
        s1.addGrade(25);
        s1.addGrade(20);


        s1.displayGrades();
//        s1.updateGrade(15, 100);//does not compile, fix it
//        s1.displayGrades();

//        System.out.println(s1.getGrades());
//        System.out.println(s1.getGradeAverage());
//        System.out.println(s1.updateGrade());

    }
}//end class Student
