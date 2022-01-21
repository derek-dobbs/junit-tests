import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testForConstructor() {
        Student s1 = new Student(12345, "Student1");

        Assert.assertEquals("Student1", s1.getName());
        Assert.assertEquals(12345, s1.getId());
        Assert.assertTrue(s1.getGrades().size() == 0);
    }

    @Test
    public void testForAddGrade() {
        Student s1 = new Student(12345, "Student1");
        s1.addGrade(95);

        Assert.assertSame(95, s1.getGrades().get(0));
    }

    @Test
    public void testForGetGradeAverage() {
        Student s1 = new Student(12345, "Student1");

        s1.addGrade(25);
        s1.addGrade(15);
        s1.addGrade(35);
        s1.addGrade(25);

        double gradeAverage = s1.getGradeAverage();

        Assert.assertTrue(gradeAverage == 25.0);
    }
}
