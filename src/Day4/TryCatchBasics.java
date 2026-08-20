package Day4;
import java.util.Scanner;
public class TryCatchBasics {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter numerator :");
            int a = sc.nextInt();
            System.out.println("Enter denominator :");
            int b = sc.nextInt();int result=a/b;
            System.out.println("the result of calculation is "+result);
        }catch (ArithmeticException e){
            System.out.println("error:cannot divide by zero");
        }
    }

}
