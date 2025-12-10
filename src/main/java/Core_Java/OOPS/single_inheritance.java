package Core_Java.OOPS;

class Person
{
    String name;
    int age;
    String place;
    float cgpa;

    void displayDetails()
    {
        System.out.println("Name is"+name);
        System.out.println("Age is"+age);
        System.out.println("Place is :"+place);
        System.out.println("CGPA:"+cgpa);

    }
}
class student extends  Person
{
    int Rollno;
    void output()
    {
        System.out.println("RollNo is "+Rollno);
    }
}
public class single_inheritance {
    public static void main(String[] args) {
     student ss= new student();
     ss.name="Manasha";
     ss.age=20;
     ss.place="salem";
     ss.cgpa=8.5f;
     ss.Rollno=501;
     ss.output();
     ss.displayDetails();
    }
}
