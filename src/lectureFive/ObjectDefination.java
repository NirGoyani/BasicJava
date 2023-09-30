package lectureFive;

public class ObjectDefination {

    //If you want to use any state(variables)/ behaviour(method) inside main method
    //static -- we don;t need to create an object
    //non-static -- we have to create an object

    static int a = 10;  // state
    int b = 20;

    public static void main(String[] args) {
        ObjectDefination ob = new ObjectDefination();
        //classname   objectName = new classname();

        System.out.println(a);  // This is used with static keyword
        System.out.println(ob.b);  // this is used with object

    }

    public void writing(){
        //behaviour
    }
}
