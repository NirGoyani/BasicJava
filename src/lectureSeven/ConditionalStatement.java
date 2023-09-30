package lectureSeven;

public class ConditionalStatement {

    public static void main(String[] args) {
        //Conditional Statements
        //1. If else
        //2. If else ladder

        int a = 30;
        int b = 20;
        //a>b --> a is bigger
        //    ---> b is bigger

        if (a>b){
            System.out.println("a is bigger");
        }else {
            System.out.println("b is bigger");
        }


        int marks = 45;

        if(marks>=50){
            System.out.println("Nirav is pass");
        }else {
            System.out.println("Nirav is fail");
        }

        int withdraw = 1200;
        int balance = 1000;

        if(balance>=withdraw){
            System.out.println("I will be able to withdraw money");
        }else {
            System.out.println("You will not be able to withdraw the money");
        }

    }
}
