package lectureEight;

public class PlayWithArray2 {

    public static void main(String[] args) {
        //If you are trying to access out of bound index - it will give you and exception

        int listOfNumbers[] = {10,2,34,434,34,93,27,34};
        //Index                0  1  2  3  4   5  6  7  8
        //length 8
        checkEvenNumber(listOfNumbers);
    }

    public static void checkEvenNumber(int list[]){
        for (int i=0 ; i<=list.length ; i++){
            if(list[i]%2==0){
                System.out.println(list[i]);
            }
        }
    }
}
