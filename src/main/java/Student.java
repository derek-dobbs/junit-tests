import java.util.ArrayList;

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
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
       this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0.0;

        for(double grade: grades) {
            sum += grade;
        }

        double average = sum / grades.size();
        return average;
    }
}//end class Student
