import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    private Student s1;
    private Student s2;
    private Student s3;

    private Cohort c1;

    @Before
    public void setUp() {
        this.c1 = new Cohort();

        this.s1 = new Student(12345, "Michael");
        this.s2 = new Student(21435, "Dwight");
        this.s3 = new Student(45312, "Jim");

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
    }

    @Test
    public void canAddCohortStudentToList() {
        Assert.assertTrue(c1.getStudents().get(0).getName() == "Michael");
        Assert.assertTrue(c1.getStudents().get(0).getId() == 12345);
    }

    @Test
    public void canGetListOfStudents() {
        Assert.assertTrue(c1.getStudents().size() == 3);
        Assert.assertTrue(c1.getStudents().get(0).getName() == "Michael");
        Assert.assertTrue(c1.getStudents().get(1).getId() == 21435);
    }

    @Test
    public void canGetAverage() {
        s1.addGrade(5);
        s1.addGrade(15);
        s1.addGrade(10);

        s2.addGrade(25);
        s2.addGrade(15);
        s2.addGrade(20);

        Assert.assertTrue(10.0 == c1.getStudents().get(0).getGradeAverage());
        Assert.assertTrue(20.0 == c1.getStudents().get(1).getGradeAverage());
    }
}// end classCohortTest
