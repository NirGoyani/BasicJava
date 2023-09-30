package lectureSeven;

public class ConditionalWithMethods {

    //deposit
    //withdraw

    public static int balance = 1000;  //400

    public static void main(String[] args) {
        deposit(100);
        withdraw(200);
        withdraw(500);
        deposit(300);
        withdraw(500);

    }

    public static void deposit(int amount){
        balance =  balance + amount;
        System.out.println("Your balance is " + balance);
    }

    public static void withdraw(int amount){
        if(balance>=amount){
            System.out.println("Yes you can withdraw money");
            balance = balance-amount;
        }else {
            System.out.println("Sorry you don't have enough balance");
        }
    }

    public static void checkBalance(){
        System.out.println("Your balance is "+ balance);
    }


}
