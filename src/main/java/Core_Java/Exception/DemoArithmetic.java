package Core_Java.Exception;

public class DemoArithmetic {
    public static void main(String[] args) {
//        int a=10;
//        int b=0;
//        System.out.println(a/b);
        try
        {
            int data=1000;
            int data1=0;
            int data2=150;
            int res=data+data2;
            System.out.println(data/data1);
            System.out.println(res);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
            //System.out.println(res);
            System.out.println("MANASHA");


        }
        int data=1000;
        int data1=0;
        int data2=150;
        int res=data+data2;
        System.out.println(data/data2);

    }
}
