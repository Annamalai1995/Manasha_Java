package Core_Java.Operator;

import java.util.Scanner;

public class Arithmetic {
    public void Arith()
    {
        int alpha=520;
        int beta=480;
        int gamma=0;
        //+,-,*,/,%
        gamma=alpha+beta;
        System.out.println("ADDING:"+gamma);
        gamma=alpha-beta;
        System.out.println("SUB:"+gamma);
        gamma=alpha*beta;
        System.out.println("MUltiply:"+gamma);
        gamma=alpha/beta;
        System.out.println("Divison:"+gamma);
        gamma=alpha%beta;
        System.out.println("Modulo:"+gamma);
    }

    public static void main(String[] args) {
        Arithmetic aa= new Arithmetic();
        aa.Arith();

        //using scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Amazon values:");
        int amazon=scan.nextInt();

        System.out.println("Enter the Flipkart values:");
        int flipkart=scan.nextInt();
        int Google=amazon+flipkart;
        System.out.println("Google Values:"+Google);



    }
}
