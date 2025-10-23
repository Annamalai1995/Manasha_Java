package Core_Java.ControlStmts;

public class Demo_Else_if {
    public static void main(String[] args) {
        int hour=15;
        if(hour < 12)
        {
            System.out.println("Good Morning");
        } else if (hour < 18) {
            System.out.println("Good AfterNoon");

        }
        else if(hour < 20)
        {
            System.out.println("Good evening");
        }
        else {
            System.out.println("Good Night");
        }
    }
}
