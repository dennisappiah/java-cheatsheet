package oop.intro;

public class EmployeeTest {
    public static void main(String[] args) {
        var employee1 = new Employee(50_000,13);

        int calculateSalary = employee1.calculateSalary(2);
        System.out.println(calculateSalary);
        System.out.println(Employee.numberofEmployees);
    }
}
