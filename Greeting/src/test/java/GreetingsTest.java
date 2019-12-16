import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingsTest {
    @Test
    public void greetingWithName() {
        String msg = greet("Bob");
        assertThat("Greeting", msg, is("Hello, Bob."));
    }

    private String greet(String... name) {
        Greetings greeting = new Greetings();

        return greeting.greet(name);
    }

    @Test
    public void greetingNoName() {
        String msg = greet();
        assertThat("Greeting", msg, is("Hello, my friend."));
    }

    @Test
    public void greetingShout() {
        String msg = greet("BOB");
        assertThat("Greeting", msg, is("HELLO BOB!"));
    }

    @Test
    public void greetingWithTwoNames() {
        String msg = greet("Jill", "Jane");
        assertThat("Greeting", msg, is("Hello, Jill and Jane."));
    }

    @Test
    public void greetingWithMultipleNames() {
        String msg = greet("Amy", "Brian", "Charlotte");
        assertThat("Greeting", msg, is("Hello, Amy, Brian, and Charlotte."));
    }

    @Test
    public void greetingWithMultipleNamesAndShout() {
        String msg = greet("Amy", "BRIAN", "Charlotte");
        assertThat("Greeting", msg, is("Hello, Amy and Charlotte. AND HELLO BRIAN!"));
    }

    @Test
    public void greetingWithMultipleNamesAndComma() {
        String msg = greet("Bob", "Charlie, Dianne");
        assertThat("Greeting", msg, is("Hello, Bob, Charlie, and Dianne."));
    }

    @Test
    public void greetingWithMultipleNamesAndEscaped() {
        String msg = greet("Bob", "\"Charlie, Dianne\"");
        assertThat("Greeting", msg, is("Hello, Bob and Charlie, Dianne."));
    }
}
