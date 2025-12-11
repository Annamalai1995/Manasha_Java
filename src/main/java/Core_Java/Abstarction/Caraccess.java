package Core_Java.Abstarction;
abstract  class car
{
    public abstract void accelartor();
    public abstract void steering();
    public  void Audi()
    {
        System.out.println("Its a luxary car ");
    }

}
public class Caraccess extends car {
    @Override
    public void accelartor() {
        System.out.println("It  acclerate the car");
    }

    @Override
    public void steering() {
        System.out.println("Its Steering car");
    }

    public static void main(String[] args) {
        car cc= new Caraccess(); //upcasting
        cc.accelartor();
        cc.steering();
        cc.Audi();

    }
}
