package lectureEleven;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTopic {

    public static void main(String[] args) {
        //Array - collection of varaibles
        String names[] = {"Nirav","Brita","Jahanavi","Bhumika"};  //fixed
        //                  0       1       2           3
        System.out.println(names[4]);

        for (String name: names) {
            System.out.println(name);
        }

        //..

        //ArrayList  - dyamic in size
        //oprtion - add, deletion, searching, changing

        ArrayList<String> nextProduct = new ArrayList<>(); // [ tshirts, Kids shirt, shoes]
                                                            //    0       1         2

        nextProduct.add("Shirts");
        nextProduct.add("Tshirts");
        nextProduct.add("Shoes");
        //..
        //..
        //..
        nextProduct.add("Night wears");
        nextProduct.add("Tshirts");
        nextProduct.remove("Shirts");

        System.out.println(nextProduct);
//        nextProduct.remove(2);
//
//        nextProduct.add(1,"Kids Shirt");
//        System.out.println(nextProduct.contains("Shirts"));
//        nextProduct.set(0,"Shirts");
//
//        System.out.println(nextProduct);


    }
}
