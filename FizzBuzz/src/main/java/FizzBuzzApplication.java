import static java.lang.System.out;

public class FizzBuzzApplication {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 100; i++) {
            out.println(fizzBuzz.print(i));
        }
    }
}
