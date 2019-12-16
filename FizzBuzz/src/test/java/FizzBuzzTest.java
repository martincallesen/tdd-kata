import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void printNumbers0() {
        testPrint(new int[]{0}, "");
    }

    @Test
    public void printNumbers2() {
        testPrint(new int[]{2}, "2");
    }

    @Test
    public void printNumbers4() {
        testPrint(new int[]{4}, "4");
    }

    @Test
    public void printFizz() {
        testPrint(new int[]{3, 6, 9, 12, 18, 21}, "Fizz");
    }

    private void testPrint(int[] numbers, String expected) {
        for(int number : numbers) {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String printResult = fizzBuzz.print(number);
            assertThat("Print", printResult, is(expected));
        }
    }

    @Test
    public void printBuzz() {
        testPrint(new int[]{5, 10, 20, 25, 35}, "Buzz");
    }

    @Test
    public void printFizzBuzz() {
        testPrint(new int[]{15, 30, 45, 60}, "Fizz" + "Buzz");
    }
}