import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void printFizz() {
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Fizz"))).print(3);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Fizz"))).print(6);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Fizz"))).print(9);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Fizz"))).print(12);
    }

    @Test
    public void printNumber() {
        new FizzBuzz(msg -> assertThat("Prints", msg, is(""))).print(0);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("1"))).print(1);
        new FizzBuzz(msg -> assertThat("Prints", msg, is(""))).print(101);
    }

    @Test
    public void printBuzz() {
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Buzz"))).print(5);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Buzz"))).print(10);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("Buzz"))).print(20);
    }

    @Test
    public void printFizzBuzz() {
        new FizzBuzz(msg -> assertThat("Prints", msg, is("FizzBuzz"))).print(15);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("FizzBuzz"))).print(30);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("FizzBuzz"))).print(45);
        new FizzBuzz(msg -> assertThat("Prints", msg, is("FizzBuzz"))).print(60);
    }
}