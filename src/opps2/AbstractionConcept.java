package opps2;

abstract class AbstractionConcept {
    //hide, show - methods, varibales
    //50%- hide 50% -shown

    public abstract void myMethod1(int a, int b); //No implemnetaiton Only declartion

    public static void myMethod2(){
        System.out.println("your message is sending");
    }

    public static void main(String[] args) {

        myMethod2();
    }

}
