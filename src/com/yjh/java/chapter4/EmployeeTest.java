package com.yjh.java.chapter4;

/**
 * @author ash_yjh
 * @create 2021-08-27 22:40
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0]=new Employee("余晋辉",7500,1999,8,16);
        staff[1]=new Employee("刘汶翰",8000,2000,6,15);
        staff[2]=new Employee("黄春龙",10000,2000,5,16);

        //提升5%的工资
        for(Employee e : staff){
            e.raiseSalary(5);
            System.out.println((e.getName()+"现在工资是"+e.getSalary()));
        }
    }
}
