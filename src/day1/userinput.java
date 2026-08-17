package day1;
import java.util.Scanner;

public class userinput {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();

        System.out.println("enter your age");
        int age = scanner.nextInt();

        System.out.println("name :"+name);
        System.out.println("age ="+age);

        scanner.close();

    }
}
