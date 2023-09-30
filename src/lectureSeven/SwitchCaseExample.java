package lectureSeven;

public class SwitchCaseExample {

    public static void main(String[] args) {
        //1 - Monday
        //2 - Tueday
        //3 - Wednesday
        //4 - Thursday

        int a =  11;

        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satu");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Your value doesnt with our condition");

        }

    }
}
