package Zad11;

/**
 * summary: Employee UML test class.
 * author: Mateusz Hinca
 **/
public class TestEmployee {
    public static void main(String[] args) {
        Employee employeeMateusz = new Employee(1, "Mateusz", "lastMateuszName", 1000);
        System.out.println(employeeMateusz.getName());
        System.out.println(employeeMateusz.getAnnualSalary());
        System.out.println(employeeMateusz.raiseSalary(30));
        System.out.println(employeeMateusz.toString());
    }
}