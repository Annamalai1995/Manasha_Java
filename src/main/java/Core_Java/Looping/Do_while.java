package Core_Java.Looping;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int staff=0;
        float time=0;
        int count=10;
        do {
            System.out.println(staff+"staff enter login time");
            time=scan.nextFloat();
            if(time>9.15)
            {
                System.out.println(time+"your late comer so salary will be deducted");
                count++;

            }
            else {
                System.out.println("Your are Good time");
            }
            staff++;

        }while (staff>0);
        System.out.println("This month later comer count"+count);
    }
}
