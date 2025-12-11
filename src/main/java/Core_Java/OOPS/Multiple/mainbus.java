package Core_Java.OOPS.Multiple;

public class mainbus  implements bus,bus1{

    @Override
    public void Travels() {
        System.out.println("Swamy Ayyappa Travels");
    }

    @Override
    public void Passenger() {
        System.out.println("Manasha");


    }

    public static void main(String[] args) {
        mainbus mb= new mainbus();
        mb.Passenger();
        mb.Travels();
     }
}
