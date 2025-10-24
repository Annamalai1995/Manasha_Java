package Core_Java.ControlStmts;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin =1234;
        int balance=15000;
        //If Else:
        System.out.println("Enter the Pin");
        int enterpin=scan.nextInt();
        if(enterpin !=pin)
        {
            System.out.println("Incorrect Pin");
        }
        else {
            System.out.println("Login Successfully");
        }
        //Switch:
        System.out.println("-------ATM--------");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("Enter CHoice");
        int choice= scan.nextInt();
        switch (choice)
        {
            case 1:
                if(balance >=0)
                {
                    System.out.println("Avaliable Balance:"+balance);
                }
                else {
                    System.out.println("Not AVailable Balance");
                }
                break;
            case 2:
                System.out.println("Enter the Amount");
                int deposit=scan.nextInt();
                if(deposit > 0)
                {
                    balance+=deposit;
                    System.out.println("Deposit Successfully"+deposit);
                    System.out.println("Update Balance:$"+balance);
                }
                else {
                    System.out.println("Invalid Deposit amount");
                }
                break;
            case 3:
                System.out.println("Enter AMount to withdraw");
                int withdraw=scan.nextInt();
                if(withdraw <= 0)
                {
                    System.out.println("Inavalid withdraw");
                } else if (withdraw > balance) {

                    System.out.println("Insuffcient Balance");
                }
                else {
                    balance-=withdraw;
                    System.out.println("Withdraw success :$"+withdraw);
                    System.out.println("Remaining Balance:$"+balance);

                }
                break;
            case  4:
                System.out.println("thank you for using HDFC BANK");
                break;
            default:
                System.out.println("Invalid Option!!");
        }


    }
}
