import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class RomanNumbers {
    private Map<String, Integer> conversionMap;
    private List<String> illegalRomanNumbers;

    public RomanNumbers() {
        this.conversionMap = new HashMap<>();
        this.conversionMap.put("I", 1);
        this.conversionMap.put("V", 5);
        this.conversionMap.put("X", 10);
        this.conversionMap.put("L", 50);
        this.conversionMap.put("C", 100);
        this.conversionMap.put("D", 500);
        this.conversionMap.put("M", 1000);

        this.illegalRomanNumbers = new ArrayList<>();
        this.illegalRomanNumbers.add("XXXXX");
        this.illegalRomanNumbers.add("IIIII");
        this.illegalRomanNumbers.add("DD");
    }

    public int convert(String romanNumber) {
        if (illegalRomanNumbers.contains(romanNumber)) {
            throw new RuntimeException("Illegal roman number");
        }

        int arabicNumber = 0;
        char[] chars = romanNumber.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (isSubtractiveNotation(chars, i)) {
                arabicNumber += subtractiveNotation(chars, i++);
            } else {
                arabicNumber += toArabicNumber(chars[i]);
            }
        }

        return arabicNumber;
    }

    private int subtractiveNotation(char[] chars, int index) {
        return toArabicNumber(chars[index + 1]) - toArabicNumber(chars[index]);
    }

    private boolean isSubtractiveNotation(char[] chars, int index) {
        return index + 1 < chars.length && (toArabicNumber(chars[index]) < toArabicNumber(chars[index + 1]));
    }

    private Integer toArabicNumber(char aChar) {
        String value = valueOf(aChar);

        return conversionMap.get(value);
    }

}
