package Day4;

import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedexample {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("data.txt");
            reader.close();

        } catch (IOException e) {
            System.out.println("Checked exception: File problem.");
        }
        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception: Division by zero.");
        }
    }
}