package Core_Java.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\Manasha.txt");
        FileInputStream fis=new FileInputStream(ff);

        int size= fis.available();
        System.out.println(size);
         byte[]get=new byte[fis.available()];
         fis.read(get);
        System.out.println(get);

        String ss= new String(get);
        System.out.println("Message of the file"+ss);


    }
}
