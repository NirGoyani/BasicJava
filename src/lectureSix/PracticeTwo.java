package lectureSix;

import static lectureSix.ImplementMethods.sumOfTwoNumbers;

public class PracticeTwo {
    //Access modifier
    //1. public -- can use anyone in the project
    //2. Private  -- only in the class
    //3. protected -- packages and subclass
    //4. default  -- packages - you don't have to write the "defaukt word"

    public int i = 10;
    private static int j = 20;
    protected static int z = 30;
    static int x = 40 ;

    public static void main(String[] args) {
        PracticeTwo practiceTwo = new PracticeTwo();
        System.out.println(practiceTwo.i);

        System.out.println(j);

        sumOfTwoNumbers();

    }

}
