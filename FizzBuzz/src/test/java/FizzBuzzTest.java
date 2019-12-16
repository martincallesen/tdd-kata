import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void printNumber() {
        testPrint("Printing Number", 0, "");
        testPrint("Printing Number", 2, "2");
        testPrint("Printing Number", 4, "4");
        testPrint("Printing Number", 7, "7");
        testPrint("Printing Number", 8, "8");
    }

    private void testPrint(String assertMsg, int number, String expected) {
        String msg = fizzBuzz.print(number);
        Assert.assertThat(assertMsg, msg, is(expected));
    }

    @Test
    public void printFizz() {
        testPrint("Printing Fizz", 3, "Fizz");
        testPrint("Printing Fizz", 6, "Fizz");
        testPrint("Printing Fizz", 9, "Fizz");
    }

    @Test
    public void printBuzz() {
        testPrint("Printing Buzz", 5, "Buzz");
    }

    @Test
    public void printFizzBuzz() {
        testPrint("Printing FizzBuzz", 15, "FizzBuzz");
        testPrint("Printing FizzBuzz", 30, "FizzBuzz");
    }
}