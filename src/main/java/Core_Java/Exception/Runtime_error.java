package Core_Java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtime_error {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value one");
            int add = scan.nextInt();
            System.out.println("Enter the value Two");
            int add1 = scan.nextInt();
            System.out.println(add + add1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException ie) {
            System.out.println(ie);
            try {
                System.out.println("enter a values");
                System.out.println("enter b values");
                Scanner scan = new Scanner(System.in);

                System.out.println("Tell us a values");
                int a = scan.nextInt();

                System.out.println("Tell us b values");
                int b = scan.nextInt();
                System.out.println(a + b);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }finally {
                System.out.println("Thank you");




        }
    }
}