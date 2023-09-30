package oops1;

public class ObjectConcept {

    //state
    static int i = 10;
    int j = 20;

    public static void main(String[] args) {
        //physical entity
        //instance of class - object
        ObjectConcept oc = new ObjectConcept();
        System.out.println(i);
        System.out.println(oc.j);
        oc.j = 30;
        System.out.println(oc.j);
        oc.barking();
        oc.sleeping();

        ObjectConcept2 oc2 = new ObjectConcept2();
        System.out.println(oc2.a);

    }

    //behaviour
    public void barking(){
        System.out.println("Dog is barking");
    }

    public void sleeping(){
        System.out.println("Dog is sleeping");
    }


}
