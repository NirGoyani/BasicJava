package oops1;

public class ConstructorTopic {

    //Constructor is a method having same name as of class
    //it does not have return type, access modifier, static
    //To call the constructor - we have to create an object and it is call automatically (implicitly)
    //Type of constructor
    //         1. Pre defined (Default) - null (blank)/hidden
    //         2. User Defined
    //              2.1 Simple
    //              2.2 Parameterized
    int j ;
    ConstructorTopic(){
       j = 10;
    }

    ConstructorTopic(int i){
        System.out.println("The value of " + i);
    }

    public static void main(String[] args) {
        //call the method
        ConstructorTopic constructorTopic = new ConstructorTopic(10);  //Object created
        constructorTopic.myBarking();
    }

    public void myBarking(){
        System.out.println("Barking");
    }
}
