package lectureSix;

public class PreDefinedMethod {
    public static void main(String[] args) {
        String name = "Niraz";
        String lastname = "Goyani";

        String firstSection = "women";   //actual

        System.out.println(name.toLowerCase());   //preDefiend method
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(lastname));
        System.out.println(name.equals("Nirav"));

        System.out.println(firstSection.equals("Women"));

        System.out.println(name.length());
        System.out.println(lastname.length());
        System.out.println(name.isEmpty());
        System.out.println(name.replace('z','v'));
        System.out.println();

    }
}
