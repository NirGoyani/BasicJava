package lectureSix;

public class ReturnTypeMethod {

    public static void main(String[] args) {
        int c = sumOfTwoNumbers(10,20);
        System.out.println(c);

        int d = subtractionOfTwoNumbers(20,10);
        System.out.println(d);

        int e = multiplicationOfTwoNumbers(10,20);
        System.out.println(e);
    }

    public static int sumOfTwoNumbers(int a, int b){
        int c = a + b;   //Local varibale
        return c;
    }

    public static int subtractionOfTwoNumbers(int a, int b){
        int d = a - b; //Local variable
        return d;
    }

    public static int multiplicationOfTwoNumbers(int a, int b){
        int e = a * b;
        return e;
    }
}
