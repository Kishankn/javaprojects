package Day1;
import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter first number:");
        int a=scanner.nextInt();
        System.out.print("enter second number:");
        int b=scanner.nextInt();
        System.out.println("addition="+ (a+b));
        System.out.println("sub="+ (a-b));
        System.out.println("multiply="+ (a*b));

        if(b !=0){
            System.out.println("divid="+ (a/b));
        }
        scanner.close();


    }
}
