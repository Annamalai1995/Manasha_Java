package Core_Java.ControlStmts;

public class Nested_if {
    public static void main(String[] args) {
        int age = 22;
        String Citizen = "India";
        if (age > 18) {
            System.out.println("Age is Valid ");
            if (Citizen.equals("Indian")) {
                System.out.println("You are eligible for Voting Process");
            }
            else {
                System.out.println("You are Not Indian");
            }
        } else {
            System.out.println("You are Not Eligible for this Process");
        }
    }
}