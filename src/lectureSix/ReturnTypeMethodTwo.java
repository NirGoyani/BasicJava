package lectureSix;

public class ReturnTypeMethodTwo {
    //Balance
    //withdraw
    //RemainingBalance
    static int balance = 1000;

    public static void main(String[] args) {
        moneyWithdraw(200);
        System.out.println(balance); //800

        moneyDeposit(572);
        System.out.println(balance); //1300

        double totalInterestGain = bankScheme(balance);
        System.out.println(totalInterestGain);   //65
    }

    public static void moneyWithdraw(int withdraw){
        balance = balance - withdraw;
    }

    public static void moneyDeposit(int deposit){
        balance = balance + deposit;
    }

    public static double bankScheme(int balance){
        double totalInterestGain = (balance * 6.6)/100;
        return totalInterestGain;
    }
}
