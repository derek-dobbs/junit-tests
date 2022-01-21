import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert;
//import static org.junit.Assert.assertNotEquals;

public class MyFirstTest {
    @Test
    public void isNotCodeupCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void derekIsDerek() {
        String student = "Derek";
        String testTaker = "Derek";

        Assert.assertEquals(student, testTaker);
    }

    @Test
    public void listsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> names = new ArrayList<>();

        languages.add("Latin");
        names.add("Latin");

        //assertEquals checks value, assertSame checks if both objects are exactly the same object

//        Assert.assertEquals(languages, names);
//        Assert.assertSame(languages, names);
        Assert.assertNotSame(languages, names);
    }

    @Test
    public void arraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void funWithPHP() {
        String language = "PHP";
//        Assert.assertTrue(language.contains("H"));
        Assert.assertFalse(language.contains("J"));
        //both conditions have to pass in order for the full test to pass
        //do not have more than one assert in a test
    }
}
