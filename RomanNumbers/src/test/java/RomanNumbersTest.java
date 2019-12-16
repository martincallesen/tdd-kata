import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RomanNumbersTest {

    @Test
    public void convertSingleRomanNumbers() {
        assertThat("Number", convert("I"), is(1));
        assertThat("Number", convert("V"), is(5));
        assertThat("Number", convert("X"), is(10));
        assertThat("Number", convert("L"), is(50));
        assertThat("Number", convert("C"), is(100));
        assertThat("Number", convert("D"), is(500));
        assertThat("Number", convert("M"), is(1000));
    }

    private int convert(String romanNumber) {
        RomanNumbers romanNumbers = new RomanNumbers();

        return romanNumbers.convert(romanNumber);
    }

    @Test
    public void convertRepeatedRomanNumbers() {
        assertThat("Number", convert("II"), is(2));
        assertThat("Number", convert("XX"), is(20));
        assertThat("Number", convert("III"), is(3));
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertRepeatedRomanNumbersThatCanBeReplacedWithI() {
        convert("IIIII");
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertRepeatedRomanNumbersThatCanBeReplacedWithV() {
        convert("VV");
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertRepeatedRomanNumbersThatCanBeReplacedWithX() {
        convert("XXXXX");
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertRepeatedRomanNumbersThatCanBeReplacedWithL() {
        convert("LL");
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertRepeatedRomanNumbersThatCanBeReplacedWithC() {
        convert("CCCCC");
    }

    @Test (expected = IllegalArgumentException.class)
    public void convertRepeatedRomanNumbersThatCanBeReplacedWithD() {
        convert("DD");
    }

    @Test
    public void convertMultipleRomanNumbers() {
        assertThat("Number", convert("XV"), is(15));
        assertThat("Number", convert("CLX"), is(160));
    }

    @Test
    public void convertMultipleRomanNumbersWithSubtractiveNotation() {
        assertThat("Number", convert("IV"), is(4));
    }

    @Test
    public void convertLargerRomanNumbers() {
        assertThat("Number", convert("MMMMCMXCIX"), is(4999));
    }
}
