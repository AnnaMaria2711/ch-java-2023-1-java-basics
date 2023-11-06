import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
    public class FizzBuzzTest {


    @Test
    void FizzBuzzTest_when1_return1(){
        // GIVEN

        int number = 1;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals(1,actual);
    }

    @Test

    void FizzBuzzTest_when2_return2() {
        // GIVEN

        int number = 2;

        // WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        // THEN
        assertEquals(2, actual);
    }

    @Test

    void FizzBuzzTest_when3_returnFizz(){

        // GIVEN

        int number = 3;

        // WHEN

        String actual = FizzBuzz.fizzBuzz(number);

        // THEN

        assertEquals("Fizz", actual);
    }
   @Test
    void FizzBuzzTest_when15_returnFizzBuzz(){
        // GIVEN

       int number = 15;

       // WHEN

       String actual = FizzBuzz.fizzBuzz(number);

       // THEN

       assertEquals("FizzBuzz", actual);
    }
}
