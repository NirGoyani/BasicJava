package lectureSix;

public class ImplementMethods {

    //Methods - it is block of statement used to achieve a task
    //2 types of methods -  1. Pre-defined  - methods which are already created by Java and has meaning
    //                      2. User-defined - methods which are created by developer/user
    //                          2.1 Simple Method  - if method has no return type (void) and no parameter (brackets are empty)
    //                          2.2 Parameterized Method - we pass parameters in the method to make method dynamic
    //                          2.3 Return Type Method - we change the return type to pass the value at calling of method position

    //Importance -- 1. Code is organized ( Neat and clean )
    //              2. Reusability

    public static void main(String[] args) {
        sumOfTwoNumbers(); //Calling the method
        sumOfTwoNumbers();

        ImplementMethods implementMethods = new ImplementMethods();
        implementMethods.sumOfThreeNumbers();

    }

    //Method Defination (Method is created)
    public static void sumOfTwoNumbers (){
        //User defined Method
        int a = 30;
        int b = 700;
        int c = a + b;
        System.out.println(c);
    }

    public void sumOfThreeNumbers(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a + b + c;
        System.out.println(d);
    }


}
