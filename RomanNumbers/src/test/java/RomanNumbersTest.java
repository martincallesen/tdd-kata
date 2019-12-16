import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumbersTest {

    private RomanNumbers romanNumber;

    @Before
    public void setUp() {
        romanNumber = new RomanNumbers();
    }

    @Test
    public void convertSingleRomanNumbers() {
        assertThat("RomanNumber", romanNumber.convert("I"), is(1));
        assertThat("RomanNumber", romanNumber.convert("V"), is(5));
        assertThat("RomanNumber", romanNumber.convert("X"), is(10));
    }

    @Test
    public void convertRepeatedRomanNumbers() {
        assertThat("RomanNumber", romanNumber.convert("II"), is(2));
        assertThat("RomanNumber", romanNumber.convert("XX"), is(20));
        assertThat("RomanNumber", romanNumber.convert("III"), is(3));
    }

    @Test (expected = RuntimeException.class)
    public void convertRepeatedOnesRomanNumbersThatCanBeReplaced() {
        romanNumber.convert("IIIII");
    }

    @Test (expected = RuntimeException.class)
    public void convertRepeatedTwentiesRomanNumbersThatCanBeReplaced() {
        romanNumber.convert("XXXXX");
    }

    @Test (expected = RuntimeException.class)
    public void convertRepeatedOneHundredRomanNumbersThatCanBeReplaced() {
        romanNumber.convert("DD");
    }

    @Test
    public void convertMultipleRomanNumbers() {
        assertThat("RomanNumber", romanNumber.convert("XV"), is(15));
        assertThat("RomanNumber", romanNumber.convert("CLX"), is(160));
    }

    @Test
    public void convertMultipleRomanNumbersWithSubtractiveNotation() {
        assertThat("RomanNumber", romanNumber.convert("IV"), is(4));
        assertThat("RomanNumber", romanNumber.convert("IX"), is(9));
        assertThat("RomanNumber", romanNumber.convert("XL"), is(40));
        assertThat("RomanNumber", romanNumber.convert("XC"), is(90));
        assertThat("RomanNumber", romanNumber.convert("CD"), is(400));
        assertThat("RomanNumber", romanNumber.convert("CM"), is(900));
    }

    @Test
    public void convertLargerRomanNumbers() {
        assertThat("RomanNumber", romanNumber.convert("MMMMCMXCIX"), is(4999));
    }
}
