import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testValue3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.getTranslate(number);
        assertEquals(expected, result);
    }
    @Test
    void testValue5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.getTranslate(number);
        assertEquals(expected, result);
    }
    @Test
    void testValue35() {
        int number = 35;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.getTranslate(number);
        assertEquals(expected, result);
    }
}