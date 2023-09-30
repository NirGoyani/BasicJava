package lectureTwo;

public class FindTheSolution {

    public  int abc = 10;  // anywhere
    private static int def = 20;  // within class
    protected static int xyz = 10;  // package and subclasses (inheritance)

    static int ged = 20;  // package

    public static void main(String[] args) {

        FindTheSolution findTheSolution = new FindTheSolution();
        System.out.println(findTheSolution.abc);

        //BODMAS - Bracket Order Division Multi Addition Subtraction
//        int a = (30 * 5)  + (30 / 2) * 20;
        //       (150) + (15) * 20
        //        150 + 300
        //        450
        int a = 10;
        int b = 20 ;
        int c = a%b;

        System.out.println(c);
        System.out.println(xyz);
    }
}
