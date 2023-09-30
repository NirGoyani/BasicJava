package oops1.polymorphsim;

public class MethodOverloading {

    public static void main(String[] args) {
        //Method Overloading - methods having the same name in same class but different parameters
        //add numbers
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.addNumbers();
        methodOverloading.addNumbers(10,20);
        methodOverloading.addNumbers(10,20,30);
        methodOverloading.addNumbers(40,50);
    }

    public void addNumbers(){
        //Hardik
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    public void addNumbers(int a, int b){
        //Brita
        System.out.println(a+b);
    }

    public void addNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }







}
