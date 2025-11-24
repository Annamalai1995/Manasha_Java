package Core_Java.Constructor;

public class Parameter {
    int Emp_id;
    String Emp_name;
    String Cmp_name;
    int age;
//    public Parameter(int E,String En,String c,int a)
//    {
//        Emp_id=E;
//        Emp_name=En;
//        Cmp_name=c;
//        age=a;
//        System.out.println("Emp_id"+Emp_id+""+"Emp_Name"+Emp_name+""
//                +"Company_name"+Cmp_name+""+"Age "+age);
//
//    }

//    public  void Output()
//    {
//        System.out.println("Emp_id"+Emp_id+""+"Emp_Name"+Emp_name+""
//        +"Company_name"+Cmp_name+""+"Age "+age);
//    }
    public  Parameter(int Emp_id,String Emp_name,String Cmp_name,int age)
    {
        this.Emp_id=Emp_id;
       this. Emp_name=Emp_name;
        this.Cmp_name=Cmp_name;
        this.age=age;
        System.out.println("Emp_id"+Emp_id+""+"Emp_Name"+Emp_name+""
        +"Company_name"+Cmp_name+""+"Age "+age);
    }


    public static void main(String[] args) {
        Parameter pp= new Parameter(101,"Manasha","CTS",21);
       // pp.Output();
        Parameter pp1= new Parameter(102,"Pavithra","CTS",21);


    }

}
