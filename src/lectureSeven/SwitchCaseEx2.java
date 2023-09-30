package lectureSeven;

import static lectureSeven.ConditionalWithMethods.*;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        //Jan - 1
        //Feb - 2
        //March - 3
        //April - 4
        //May - 5
        //Dec - 12

        String monthName = "Jan";

        switch (monthName){
            case "Jan":
                System.out.println("1");
                break;
            case "Feb":
                System.out.println("2");
                break;
            case "March":
                System.out.println("3");
                break;
            case "April":
                System.out.println("4");
                break;
            case "May":
                System.out.println("5");
                break;
            case "June":
                System.out.println("6");
                break;
            case "July":
                System.out.println("7");
                break;
            case "August":
                System.out.println("8");
                break;
            case "Sep":
                System.out.println("9");
                break;
            default:
                System.out.println("Your value doesn't match");
        }

        //1. To deposit
        //2. To withdraw
        //3. To check balance

        int number = 4;

        switch (number){
            case 1:
                System.out.println("You want to deposit");
                deposit(200);
                break;
            case 2:
                System.out.println("You want to withdraw money");
                withdraw(300);
                break;
            case 3:
                checkBalance();

        }
    }
}
