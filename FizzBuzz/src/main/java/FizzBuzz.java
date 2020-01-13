public class FizzBuzz {
    private final Printer printer;

    public FizzBuzz(Printer printer) {
        this.printer = printer;
    }

    public void print(int number) {
        if(shouldPrintFizzBuzz(number) ) {
            printer.print("FizzBuzz");
        } else if(shouldPrintBuzz(number) ){
            printer.print("Buzz");
        } else if(shouldPrintFizz(number)){
            printer.print("Fizz");
        } else if (shouldPrintNumber(number)){
            printer.print(""+number);
        }
    }

    private boolean shouldPrintNumber(int number) {
        return number > 0 && number < 101;
    }

    private boolean shouldPrintFizzBuzz(int number) {
        return number % 15 == 0 &&  shouldPrintNumber(number);
    }
    private boolean shouldPrintBuzz(int number) {
        return number % 5 == 0 && shouldPrintNumber(number);
    }
    private boolean shouldPrintFizz(int number) {
        return number % 3 == 0  && shouldPrintNumber(number);
    }
}
