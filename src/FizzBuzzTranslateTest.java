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
}