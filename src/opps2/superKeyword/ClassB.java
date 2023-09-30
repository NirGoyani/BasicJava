package opps2.superKeyword;

public class ClassB extends ClassA {

    public static final int FINAL_PRICE = 1000;

    public void myMethod(){
        super.myMethod();
        System.out.println("This is my method B");
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.myMethod();
    }
}
