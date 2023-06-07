package oop.intro;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberofEmployees;
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberofEmployees++;
    }
    public int calculateSalary(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    //overloading a method
    public int calculateSalary(int extraHours, int bonus) {
        return baseSalary + (hourlyRate * extraHours) + bonus;
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }


}
