package lectureEight;

public class StringArray {
    public static void main(String[] args) {
        String names[] = {"Nirav","Naresh","Amit","Deep"};
        //Index             0       1       2       3
        char charectars[] = {'a','b','c','d'};

        for(int i = 0; i <= names.length-1; i++){
            System.out.println(names[i]);
        }

        for(String name : names){
            System.out.println(name);
        }

        for (char ch : charectars){
            System.out.println(ch);
        }
    }
}
