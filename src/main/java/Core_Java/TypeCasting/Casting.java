package Core_Java.TypeCasting;

public class Casting {
    public static void main(String[] args) {
        //Changing one datatype to another datatype
        //Ex:int to float and float to int

        char inital='K';
        int Age=74;
        float Height=5.4f;


        int name=(int)inital;
        System.out.println(name);

        float Age1=(float) Age;
        System.out.println("AGE IS FLOAT :"+Age1);

        double hei=(double) Height;
        System.out.println("Height Double :"+hei);

        char Hello=(char)Age;
        System.out.println("HELLO CHar :"+Hello);


    }

}
