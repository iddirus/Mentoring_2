package oop.polymorphism.methodoverloanding;

public class Calculator {

    // declare method // static

    public static void doMultiplication(int num1, int num2) {
        int output = num1 * num2;
        System.out.println("output is :" + output);

    }

    public static void doMultiplication(int num1, int num2, int num3) {
        int output = num1 * num2 * num3;
        System.out.println("output is :" + output);

    }

    public static void doMultiplication(int num1, int num2, double num3) {
        double output = num1 * num2 * num3;
        System.out.println("output is :" + output);

    }

    // non static methods
    public void employeeInfo() {
        System.out.println("this is employee information non parameterized method");
    }

    public void employeeInfo(String firstName) {
        System.out.println("employee first name is : " + firstName);
    }

    public void employeeInfo(String firstName, String lastName) {
        System.out.println("employee first name is " + firstName + " " + " employee last name is  " + lastName);
    }

    public void employeeInfo(String firstName, String lastName, int age) {
        System.out.println("employee first name is " + firstName + " " + " employee last name is  " + lastName + " " +
                "employee age is  " + age);
    }


}
