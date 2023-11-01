
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestingTest {

    @Test
    public void multiplyTest_when5Ties6_thenReturn30() {
        //GIVEN
        int value1 = 5;
        int value2 = 6;
        String a = "Hallo";


        //WHEN
        int actual = Testing.multiply(value1, value2);

        //THEN

        assertEquals(30, actual);

    }

    @Test
    public void divideTest_when27DividedBy9_return3() {
        // GIVEN
        int value1 = 27;
        int value2 = 9;


        // WHEN
        int actual = Testing.divide(value1, value2);


        // THEN
        assertEquals(3, actual);

    }

    @Test

    public void addTest_when77AddedTo22_return99() {
        // GIVEN

        int value1 = 77;
        int value2 = 22;

        // WHEN

        int actual = Testing.add(value1, value2);


        // THEN

        assertEquals(99, actual);
    }

    @Test
    public void evenNumberTest_whenNumberIsEven_returnTrue() {
        // GIVEN

        int value1 = 60;

        // WHEN

        boolean shouldBeTrue = Testing.evenNumber(value1);

        // THEN

        assertTrue(shouldBeTrue);
    }

    @Test
    public void lowerCaseToUpperCaseTest_whenStringConvertedToUppercase_ReturnTrue() {

        // GIVEN

        String value1 = "helloooo!";

        // WHEN

        String actual = Testing.lowerCaseToUpperCase(value1);

        // THEN

        assertEquals("HELLOOOO!", actual);

    }

    @Test
    public void checkForPositiveTest_ifNumberPositive_returnTrue() {

        // GIVEN

        double value1 = 44.33;

        // WHEN

        boolean actual = Testing.checkForPositive(value1);

        // THEN

        assertTrue(actual);
    }

    @Test

    public void checkForPositiveTest_ifNumberPositive_returnFalse() {

        // GIVEN

        double value1 = 44.33;

        // WHEN

        boolean actual = Testing.checkForPositive(value1);

        // THEN

        assertFalse(actual);
    }
}
