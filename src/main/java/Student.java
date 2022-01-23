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

//        this.grades.addGrade(newGrade);

        /////////////////////////////////////
        //Scanner scanner = new Scanner(System.in);
        //        scanner.useDelimiter("\n");
        //
        //        //display list of grades
        //        System.out.printf("Here are the grades for %s:%n", this.getName());
        //        for (int i = 0; i < this.grades.size(); i++) {
        //            System.out.println(this.grades.get(i));
        //        }
        //
        //        //prompt user for which grade they would like to remove
        //        System.out.print("What grade would you like to remove? ");
        //        int userGradeToRemove = scanner.nextInt();
        //
        //        //prompt the user for what grade they would like to change it to
        //        System.out.print("What grade would you like to change it to? ");
        //        int userGradeToAdd = scanner.nextInt();
        //
        //        //loop through the Student's list of grades
        //        for (int i = 0; i < this.grades.size(); i++) {
        //            //if the input the user entered matches the value of the current iteration
        //            //output the original grade (variable) was changed to (variable)
        //            if(this.grades.get(i) == userGradeToRemove) {
        //                this.grades.remove(this.grades.get(i));
        //            }
        //        }
        //        this.addGrade(100);
        //        System.out.println("Here is the new grades list:");
        //
        //        for (int i = 0; i < this.grades.size(); i++) {
        //            System.out.println(this.grades.get(i));
        //        }
        //
        //        return grades; //was forced by IntelliJ to return something, even when return type was void in the method. This is why this method returns a boolean.
        /////////////////////////////////////
    }

    public void displayGrades() {
        System.out.println("Here are the grades for: " + this.getName());
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
//        s1.updateGrade(15, 100);

//        System.out.println(s1.getGrades());
//        System.out.println(s1.getGradeAverage());
//        System.out.println(s1.updateGrade());

    }
}//end class Student
