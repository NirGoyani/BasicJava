package lectureEleven;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTopic {
    public static void main(String[] args) {
        //ArrayList  - slower - 1) allows the duplicate values
        //LinkedList  - faster
        //HashSet - 1) No Duplicate values - slower
        //LinkedhashSet - faster

        HashSet<String> studentNames = new HashSet<>();
        studentNames.add("Nirav Goyani");
        studentNames.add("Amit");
        studentNames.add("Deep");
        studentNames.add("Amit");
        studentNames.remove("Deep");
        studentNames.remove("Amit");
        studentNames.add("Amit vagahani");

        System.out.println(studentNames);

        LinkedHashSet<String> nextProducts = new LinkedHashSet<>();
        nextProducts.add("Tshirt");
        nextProducts.add("Shirt");
        nextProducts.add("shoes");
        nextProducts.add("Shirt");

        System.out.println(nextProducts);


    }
}
