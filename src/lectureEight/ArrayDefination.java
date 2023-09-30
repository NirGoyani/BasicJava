package lectureEight;

public class ArrayDefination {

    public static void main(String[] args) {
        //Array - collection of similar data type of variables
               // How to print/ use the value ?   By the Index - number starts from 0.
              // How to get the length of array ? by using this length
              // Change the value
             // Print all the values from the array - for loop
        //  for each loop

        int a = 10;
        a++;
        System.out.println(a);

        int listNumber[] = {10,20,30,40,50,60,70,80,43,345,345,324234,234,234,234,32,23,234,234,2342,34,234,234,32,423,4,234,23,4,234,24,23,42,342,34,23,42,42,34,234,23,21412};   //Fixed in size
        //Index             0  1  2  3  4  5  6  7  8   9  10   11     12  13  14  15 16 17.......                                                                             42
        //length            1  2  3

        listNumber[3] = 50;

        //To fix the size of array
       String names[] = new String[6];
       names[0] = "Nirav";
       names[1] = "Goyani";
       names[2] = "Brita";
       names[3] = "Pritesh";
       names[4] = "Bhavin";
       names[5] = "Deep";

        listNumber[3] =  12;
        listNumber[3]++;
        System.out.println(listNumber[3]);

        listNumber[5] = listNumber[5] + listNumber[6];
        System.out.println(listNumber[5]);

        listNumber[10] = listNumber[1] * listNumber[2];
        System.out.println(listNumber[10]);

//        System.out.println(listNumber[0]);
//        System.out.println(listNumber[1]);
//        System.out.println(listNumber[2]);
        System.out.println(listNumber.length);

        for (int i=0; i<=listNumber.length-1 ; i++){
            System.out.println(listNumber[i]);
        }

        String names1[] = {"Nirav","Naresh","Amit","Deep"};
        //Index             0       1       2       3

        for(int i = 0; i <= names1.length-1; i++){
            System.out.println(names1[i]);
        }


        // for each -- it will take each value from the array and store in the variable and then we can print it
        //  you dont have control on index, it will print all the values
        for (int i : listNumber){
            System.out.println(i);
        }






    }
}
