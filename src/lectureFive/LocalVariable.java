package lectureFive;

public class LocalVariable {

    int a = 20;  //Global variable

    static int b = 20; //Static variable


    public static void main(String[] args) {
       LocalVariable lv = new LocalVariable();  // I created object of class
        System.out.println(lv.a);
        System.out.println(b);  // this cannot be used because b is defined in watford()
    }

    public void watford(){
        int a = 20;  //Local varaible
        System.out.println(a);
        System.out.println(b);
    }

    public void harrow(){
        System.out.println(a);
        System.out.println(b);
    }

}
