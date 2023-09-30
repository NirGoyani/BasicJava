package oops1.polymorphsim;

import oops1.inheritance.ClassA;

import static oops1.polymorphsim.ClassA.mySurname;

public class ClassB extends ClassA {

    public static void main(String[] args) {
        myName();
        mySurname();
    }

    public static void myName(){
        System.out.println("Goyani Junior Nirav child");
    }
}
