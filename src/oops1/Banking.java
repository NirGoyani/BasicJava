package oops1;

public class Banking {

    static int balance;

    Banking(int runtimebalance){
        balance = runtimebalance;
    }


    public static void main(String[] args) {
        Banking banking = new Banking(1000);

    }

    public static void withdraw(int j){
        balance = balance-j;
        System.out.println("your balance is");
        System.out.println(balance);
    }
}
