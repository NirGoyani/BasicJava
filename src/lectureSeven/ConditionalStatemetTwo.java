package lectureSeven;

public class ConditionalStatemetTwo {

    public static void main(String[] args) {
        //100-90  -- A
        //89-80  --- B
        //79-70  --- C
        //69-60   --- D
        //>60    ---failed

        int marks = 55;

        if(marks>100){
            System.out.println("There is an input error");
        }else if(marks<=100 && marks>=90){
            System.out.println("you got A grade");
        } else if (marks<=89 && marks>=80) {
            System.out.println("You got B grade");
        } else if (marks<=79 && marks>=70) {
            System.out.println("You got C grade");
        } else if (marks<=69 && marks>=60) {
            System.out.println("You got D grade");
        }else {
            System.out.println("You are failed");
        }

        //a=10 , b=20, c=30


        


    }
}
