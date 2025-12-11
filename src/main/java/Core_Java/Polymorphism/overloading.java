package Core_Java.Polymorphism;

public class overloading {
    public void Add(int a,int b)
    {
        if(a==b)
        {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Not equal");
        }
    }
    public void Add(float a,float b)
    {
        float sum=a+b;
        System.out.println("Add the values"+sum);
    }
    public  void  Add(String name,String name1)
    {
        if(name.equalsIgnoreCase(name1))
        {
            System.out.println("Both name are equals");
        }
    }

    public static void main(String[] args) {
        overloading ol=new overloading();
        ol.Add(100,150);
        ol.Add(100.5f,100.5f);
        ol.Add("Manasha","manasha");
    }
}
