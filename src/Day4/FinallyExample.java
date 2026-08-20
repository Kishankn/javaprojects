package Day4;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class FinallyExample {
    public static void main(String[] args)

    {
        Scanner fileScanner = null;
        try {
            File file = new File("src/DAY4/data.txt");
            System.out.println(file.getAbsolutePath());
            fileScanner = new Scanner(file);
            System.out.println("\nFile Content");
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception + " + e);
        }finally {
            if(fileScanner != null){
                fileScanner.close();
            }
            System.out.println("Closed");
        }
    }
}