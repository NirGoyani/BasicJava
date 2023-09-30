package lectureFive;

public class PracticeOperators {

    public static void main(String[] args) {
         //1. Arithmetic
        //2.  Assignement
        //3. Comparision   -- a>10, a>b, b<=c
        //4. Logical ---  && , || , !

        int withdraw = 200;
        int balance = 2000;

        System.out.println("Will I be able to withdraw :");
        boolean willIBeAbleToWithdraw = withdraw <= balance && balance>=1500;

        System.out.println(willIBeAbleToWithdraw);

        balance -= withdraw;
        System.out.println(balance);
    }
}
