package com.mrinalgupta.day4;

import java.util.Scanner;

public class CalculatorProject {
  //    add
  public static int addition(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }
  //    subtract
  public static int subtraction(int num1, int num2) {
    int subtract = num1 - num2;
    return subtract;
  }
  //    multiply
  public static int multiplication(int num1, int num2) {
    int multiply = num1 * num2;
    return multiply;
  }
  //    divide
  public static int division(int num1, int num2) {
    int divide = num1 / num2;
    return divide;
  }
}

class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number : ");
    int number1 = sc.nextInt();
    System.out.println("Enter Second number : ");
    int number2 = sc.nextInt();

    System.out.println("addition : " + CalculatorProject.addition(number1, number2));
    System.out.println(" subtraction : " + CalculatorProject.subtraction(number1, number2));
    System.out.println("multiplication : " + CalculatorProject.multiplication(number1, number2));
    System.out.println("division : " + CalculatorProject.division(number1, number2));
  }
}
