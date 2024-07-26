import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        int userId = 64764654;
        short atmPin = 1234;
        double userBalance = 10000;

        System.out.println("please provide atm pin");
        int userEnteredPin = scan.nextInt();
        if (atmPin == userEnteredPin) {
            System.out
                    .println("click 1 for withdraw\nclick 2 for deposit\nclick 3 for check balance\nclick 4 for exit");
            int seleted = scan.nextInt();
            switch (seleted) {
                case 1:
                    System.out.println("you clicked withdraw option\nplease entered withdraw amount");
                    int withdraw = scan.nextInt();
                    if (withdraw > userBalance) {
                        System.out.println("kasu illa");
                    } else {
                        userBalance -= withdraw;
                        System.out.println("your balance amount " + userBalance);
                    }
                    break;
                case 2:
                    System.out.println("you clicked deposit option\nplease entered deposit amount");
                    int deposit = scan.nextInt();
                    if (deposit < 0) {
                        System.out.println("kasu illa");
                    } else {

                        userBalance += deposit;
                        System.out.println("your balance amount " + userBalance);
                    }
                    break;
                case 3:
                    System.out.println("you clicked check balance option");

                    System.out.println("your balance amount " + userBalance);
                    break;
                case 4:
                    System.out.println("you clicked exit option");

                    break;
                default:
                    System.out.println("You entered a wrong option");
                    break;
            }
        } else {
            System.out.println("you entered wrong pin");
        }
    }
}