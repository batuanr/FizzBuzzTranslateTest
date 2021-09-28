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
    void testValue30() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.getTranslate(number);
        assertEquals(expected, result);
    }
    @Test
    void testValue26() {
        int number = 26;
        String expected = "26";
        String result = FizzBuzzTranslate.getTranslate(number);
        assertEquals(expected, result);
    }
}