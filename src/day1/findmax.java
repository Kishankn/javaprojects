package day1;
import java.util.Scanner;
public class findmax {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 40;

        int maximum = a;
        if (b > maximum) {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        System.out.println("the maximum of all" + maximum);
    }

}