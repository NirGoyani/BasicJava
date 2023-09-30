package lectureSix;

public class ParametrizedMethod {

    public static void main(String[] args) {
        sumOfTwoNumbers(30, 40);
        sumOfTwoNumbers(20, 50);
        sumOfTwoNumbers(550, 40);
        subtractionOfTwoNumbers(200, 24);
        multiplicationOfTwoNumbers(230, 221);
        multiplicationOfTwoNumbers(22, 23);
        divisionOfTwoNumbers(210, 22);
    }

    public static void sumOfTwoNumbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void subtractionOfTwoNumbers(int a, int b) {
        System.out.println(a - b);
    }

    public static void multiplicationOfTwoNumbers(int a, int b) {
        System.out.println(a * b);
    }

    public static void divisionOfTwoNumbers(int a, int b) {
        System.out.println(a / b);
    }


}
