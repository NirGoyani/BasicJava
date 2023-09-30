package lectureSix;

public class PracticeOne {
    //Type of variable
    //Local, Global and static
    int b = 20 ;  // Global -- To use the global varibale we need to create an object
    static int c = 30 ; // static variable

    String name = "Nirav";

    public static void main(String[] args) {
        int a = 10;  // Local
        System.out.println(a);
        PracticeOne practiceOne = new PracticeOne();  //This is an object
        System.out.println(practiceOne.b);

        System.out.println(c);

    }



}

