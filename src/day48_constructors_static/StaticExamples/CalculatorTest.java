package day48_constructors_static.StaticExamples;

import day04_variable_intro.VariableDeclaration;

public class CalculatorTest {
    public static void main(String[] args) {
        // add iss static method can be called using Classmate.staticMethodName
        // static way of calling the method
        Calculator.add(5, 3);

        // Calculator.multiply(2, 4); Error: multiply is not static
        // multiply is instance method and we are creating object which calling it
        Calculator calcObject = new Calculator();
        calcObject.multiply(2, 4);
        // static method can also called using a object
        calcObject.add(10, 45);
    }
}
