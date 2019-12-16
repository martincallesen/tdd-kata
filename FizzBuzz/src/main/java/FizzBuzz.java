public class FizzBuzz {

    public String print(int number) {
        String prints = "";

        if(isFizz(number)){
            prints = "Fizz";
        }

        if(isBuzz(number)){
            prints += "Buzz";
        } else {
            if(shouldPrintNumber(number, prints)) {
                prints = Integer.toString(number);
            }
        }

        return prints;
    }

    private boolean shouldPrintNumber(int number, String prints) {
        return number != 0 && prints.length() == 0;
    }

    private boolean isBuzz(int number) {
        return number != 0 && number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number != 0 && number % 3 == 0;
    }
}
