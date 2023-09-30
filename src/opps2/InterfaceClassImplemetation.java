package opps2;

public class InterfaceClassImplemetation implements InterfaceOne,InterfaceTwo{
    @Override
    public void myMethod() {
        System.out.println("THis is my implementation");
    }

    public static void main(String[] args) {
        InterfaceClassImplemetation interfaceClassImplemetation = new InterfaceClassImplemetation();
        interfaceClassImplemetation.myMethod();
    }
}
