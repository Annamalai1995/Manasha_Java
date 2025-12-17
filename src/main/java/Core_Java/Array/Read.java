package Core_Java.Array;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        String company[]={"Wipro","Cts","Accenture","Infosys","Tcs"};
        Scanner scan = new Scanner(System.in);
        System.out.println(company.length);
        System.out.println("Tell us company name");
        String company1=scan.next();

        for(int i=0;i<company.length;i++)
        {
            if(company1.equalsIgnoreCase(company[i]))
            {
                System.out.println(i);
                System.out.println("Company names List"+company1);
                return;
            }
        }
        System.out.println("Not valid ");
    }
}
