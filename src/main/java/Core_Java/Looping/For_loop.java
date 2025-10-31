package Core_Java.Looping;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        for(int myrequirement=10;myrequirement>0;)
        {
            System.out.println("what your experience");
            float experience= scan.nextFloat();
            if(experience >=4 && experience <=8)
            {
                System.out.println("Your are selected company");
                myrequirement--;

            }
            else {
                System.out.println("try to improve your experience");
            }
        }

    }
}
