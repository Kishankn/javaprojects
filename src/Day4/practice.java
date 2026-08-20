package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        Path path = Paths.get("src/DAY4/data.txt");
        System.out.println(path.toAbsolutePath());
        try (Stream<String> lines = Files.lines(path)) {
            System.out.println("\nFile Content");
            lines.forEach((System.out::println));
        } catch (IOException e) {
            FileNotFoundException fnf = new FileNotFoundException(e.getMessage());
            System.out.println("Exception + " + fnf);
        } finally {
            System.out.println("Closed");
        }
    }
}
