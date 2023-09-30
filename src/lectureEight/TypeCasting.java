package lectureEight;

public class TypeCasting {
    //To store the value of one data type to different data type;
    public static void main(String[] args) {

        //byte -> short -> int -> long -> float -> double
        //     <-

        //Wide type casting - automatic
        byte a = 123;
        short b  ;
        b=a;

        //Narrow type casting
        a = (byte) b;
        float f = 12412.234f;
        int i = 234;
        i = (int) f;
        System.out.println(i);
    }
}
