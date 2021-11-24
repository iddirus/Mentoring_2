package oop.polymorphism.methodoverloanding;

public class Test {

    public static void main(String[] args) {
        Calculator.doMultiplication(12,45);
        Calculator.doMultiplication(13,14,45);
        Calculator.doMultiplication(11,2,12.5);

        System.out.println("***************************************************");

        // create object of calculator class
        Calculator calculator = new Calculator();
        calculator.employeeInfo();
        calculator.employeeInfo("iddir");
        calculator.employeeInfo("cristiano","ronaldo");
        calculator.employeeInfo("joe","biden",71);
    }
}
