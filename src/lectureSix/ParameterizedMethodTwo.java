package lectureSix;

public class ParameterizedMethodTwo {

    public static void main(String[] args) {

        ParameterizedMethodTwo parameterizedMethodTwo = new ParameterizedMethodTwo();
        parameterizedMethodTwo.employeeId(101);

        employeeName("Nirav Goyani");
        employeeSalary(200000000);
    }

    public void employeeId(int a){
        System.out.println("This employee id is " + a);
    }

    public static void employeeName(String name){
        System.out.println("Employee name is " + name);
    }

    public static void employeeSalary(int salary){
        System.out.println("Salary is "+ salary);
    }

}
