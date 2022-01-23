import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student fer;
    private Student ryan;

    @Before
    public void setUp() {
        this.fer = new Student(1L, "fer");
        this.ryan = null;
    }

    @Test
    public void testCreateStudent(){
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }

    @Test
    public void testAddGrade(){
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}