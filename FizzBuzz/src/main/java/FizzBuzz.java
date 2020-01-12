public class FizzBuzz {
    private final Printer printer;

    public FizzBuzz(Printer printer) {
        this.printer = printer;
    }

    public void print(int number) {
        String msg = "";

        if(shouldPrintFizz(number)){
            msg = "Fizz";
        }

        if(shouldPrintBuzz(number)){
            msg += "Buzz";
        }

        if(shouldPrintNumber(number) && msg.equals("")){
            msg += number;
        }

        printer.print(msg);
    }

    private boolean shouldPrintNumber(int number) {
        return number > 0 && number < 101;
    }

    private boolean shouldPrintBuzz(int number) {
        return number % 5 == 0 && shouldPrintNumber(number);
    }

    private boolean shouldPrintFizz(int number) {
        return number % 3 == 0  && shouldPrintNumber(number);
    }
}
