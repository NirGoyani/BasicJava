package lectureEleven;

public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.arrayMethod();
    }

    public void arrayMethod() {
        //Array
        String names[] = {"Nirav","amit","bhavin"};
        //   0      1       2

        //Exception Handling
        try {
            System.out.println(names[3]);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Out code is moved on");
        }

        System.out.println(names[2]);
        System.out.println(names[1]);
    }
}
