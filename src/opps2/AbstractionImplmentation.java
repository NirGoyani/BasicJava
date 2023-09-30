package opps2;

public class AbstractionImplmentation extends AbstractionConcept {

    public void myMethod1(int a, int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("This is implementation of that hidden method");
    }

    public static void main(String[] args) {
        AbstractionImplmentation abstractionImplmentation = new AbstractionImplmentation();
        abstractionImplmentation.myMethod1(10,20);
    }


}
