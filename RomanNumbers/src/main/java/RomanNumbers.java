import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    private final Map<String, Integer> map;
    private final Map<String, Integer> irregularRomanNumbers;

    public RomanNumbers() {
        map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        irregularRomanNumbers = new HashMap<>();
        irregularRomanNumbers.put("I", 5);
        irregularRomanNumbers.put("V", 10);
        irregularRomanNumbers.put("X", 50);
        irregularRomanNumbers.put("L", 100);
        irregularRomanNumbers.put("C", 500);
        irregularRomanNumbers.put("D", 1000);

    }

    public Integer convert(String romanNumber) {
        int value = 0;

        for (int indexInRomanString = 0; indexInRomanString < romanNumber.length(); indexInRomanString++) {
            String currentCharacter = getSingleCharacter(romanNumber, indexInRomanString);
            Integer currentValue = getValue(currentCharacter);
            Integer nextValue = getNextValue(romanNumber, indexInRomanString);

            if(currentValue < nextValue){
                value -= currentValue;
            } else {
                value += currentValue;
            }

            isIrregular(value, currentCharacter);
        }

        return value;
    }

    private String getSingleCharacter(String romanNumber, int indexOfRomanString) {
        return Character.toString(romanNumber.charAt(indexOfRomanString));
    }

    private int getValue(String singleCharacter) {
        if (map.containsKey(singleCharacter)) {
            return map.get(singleCharacter);
        }

        return 0;
    }

    private Integer getNextValue(String romanNumber, int indexOfRomanString) {
        int nextValue = 0;

        if(indexOfRomanString+1 < romanNumber.length()) {
            String nextCharacter = getSingleCharacter(romanNumber, indexOfRomanString + 1);
            nextValue = getValue(nextCharacter);
        }

        return nextValue;
    }

    private void isIrregular(int value, String singleCharacter) {
        irregularRomanNumbers.forEach((s, i) -> {
            if (s.equals(singleCharacter) && i.equals(value)) {
                throw new IllegalArgumentException("Irregular roman number");
            }
        });
    }
}
