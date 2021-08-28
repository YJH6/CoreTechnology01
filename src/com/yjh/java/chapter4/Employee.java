package com.yjh.java.chapter4;


import java.time.LocalDate;

/**
 * @author ash_yjh
 * @create 2021-08-27 22:36
 */
public class Employee {
    private static int nextId=1;
    private int id;
    private final String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary,int year,int month,int day) {
        id=nextId;
        nextId++;
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    public static void main ( String [ ] args ) // unit test
    {
        Employee e = new Employee(" Romeo ", 50000, 2003, 3, 31);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
