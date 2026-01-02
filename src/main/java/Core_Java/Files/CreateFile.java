package Core_Java.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        //syntax
        //File  filename=  new File("PATH");
        //create file
        File ff= new File("F:\\Manasha.txt");
//        ff.createNewFile();
//        System.out.println("File created Successfully"+ff.getName());
        FileOutputStream fo = new FileOutputStream(ff);
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the file text ");
        String notes=scan.nextLine();
        fo.write(notes.getBytes());
        System.out.println(ff.getName()+"write Success");

    }
}
