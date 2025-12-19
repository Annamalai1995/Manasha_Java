package Core_Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class update {
    public static void main(String[] args) {
        String places[]={"Ooty","Kodaikanal","Munnar","yercaud"};
        places[2]="chennai";
        //System.out.println(Arrays.toString(places));
        update up = new update();
        System.out.println("Before Update Array"+Arrays.toString(places));
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell us index position");
        int index=scan.nextInt();
        System.out.println("your are selected position"+index+"position values"+places[index]);
        System.out.println("Tell us new update ");
        String places1 =scan.next();
        places[index]=places1;
        System.out.println("After update values"+Arrays.toString(places));


    }
}
