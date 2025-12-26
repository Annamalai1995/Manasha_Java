package Core_Java.Exception;

import java.util.Scanner;

public class chance {
    static Scanner scan= new Scanner(System.in);
    public  static  void unlimit(String text) {
        try {
            System.out.println("Tell us text Starting string names");
            int start = scan.nextInt();
            System.out.println("Tell us text Ending string names");
            int end = scan.nextInt();
            System.out.println("Content of String " + text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("total string length" + text.length() + "tell us in between words ");
            unlimit(text);
        }
    }
        public  static  void limit(String  text1,int chance)
        {
            try
            {
                System.out.println("Tell us text Starting string names");
                int start=scan.nextInt();
                System.out.println("Tell us text Ending string names");
                int end=scan.nextInt();
                System.out.println("Content of String "+text1.substring(start,end));
            }
            catch (StringIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.println("total string length"+text1.length()+"tell us in between words ");
                if(chance < 3)
                {
                    chance++;
                    limit(text1,chance);

                }
                else {
                    System.out.println("chance over");
                }

            }


        }

    public static void main(String[] args) {
        String data="Happiness overloaded";
        limit(data,1);
    }
}
