package Core_Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        //syntax:
        //datatype arrayname[]
        //int a[];
        int a[]={10,20,30,40,50};
        System.out.println(a);
        //One MEthod
        System.out.println(Arrays.toString(a));
        String names[]={"Manasha","Pavithra","Sumathi","Praba","Harini"};
        //Loop method
        for(int i=0;i< names.length;i++)
        {
            System.out.println("Array values"+names[i]);
        }

        //FOr Each Loop
        //for(variablename:arrayname)
//    {
//        smts
//    }
        for(String students:names)
        {
            System.out.println("EACH LOOP values "+students);
        }


        //using scanner class
        char letter[]=new char[5]; //declaration
        for(int i=0;i<letter.length;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the letters");
            char letter1=scan.next().charAt(0);
            letter[i]=letter1;
        }
        System.out.println("Array values:"+Arrays.toString(letter));

    }

}
