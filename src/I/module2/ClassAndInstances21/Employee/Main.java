package I.module2.ClassAndInstances21.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Bob", 75000, 1987, 6, 15);
        staff[1] = new Employee("Lex", 375000, 1997, 12, 15);
        staff[2] = new Employee("Bo", 175000, 1999, 8, 15);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salry=" + e.getSalary() + ", hireDay=" + e.getHireDay());

    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary = salary + raise;
    }
}