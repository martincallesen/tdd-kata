public class FizzBuzz {
    public String print(int number) {
        StringBuilder msg = new StringBuilder();

        if(number != 0){
            if (isFizz(number)) {
                msg.append("Fizz");
            }

            if (isBuzz(number)) {
                msg.append("Buzz");
            }

            if ("".equals(msg.toString())) {
                msg.append(number);
            }
        }

        return msg.toString();
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
