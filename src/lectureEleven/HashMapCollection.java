package lectureEleven;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        //Hashmap - key-value pair
        //          Unordered
        //          Key must be unique
        //          First - Nirav
        //          Second - Amit
        //          Third - Brita

        HashMap<String,String> names = new HashMap<>();
        names.put("First","Nirav");
        names.put("Second","Amit");
        names.put("Third", "Brita");
        names.put("Fourth","Jahanavi");

        System.out.println(names);
        System.out.println(names.get("Third"));

        HashMap<String,Integer> cars = new HashMap<>();
        cars.put("BMW",10000);
        cars.put("Mercedes",40000);
        cars.put("Audi",45000);

        System.out.println(cars.get("BMW"));
        System.out.println(cars.get("Audi"));

    }
}
