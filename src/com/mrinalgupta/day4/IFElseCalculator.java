package com.mrinalgupta.day4;

import java.util.Scanner;

public class IFElseCalculator {
  public static int calculator(int number1, int number2, int decider) {
    if (decider == 1) {
      System.out.println("performing addition");
      int sum = number1 + number2;
      return sum;
    } else if (decider == 2) {
      System.out.println("performing subtraction");
      int subtract = number1 - number2;
      return subtract;
    } else if (decider == 3) {
      System.out.println("performing multiplication");
      int multiply = number1 * number2;
      return multiply;
    } else if (decider == 4) {
      System.out.println("performing division");
      int divide = number1 / number2;
      return divide;
    } else {
      System.out.println("Enter a number between 1 to 4.");
    }
    return 0;
  }
}

class TestIF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number : ");
    int number1 = sc.nextInt();
    System.out.println("Enter second number : ");
    int number2 = sc.nextInt();
    System.out.println("enter a decider value : ");
    int decider = sc.nextInt();
    int calculatorOutput = IFElseCalculator.calculator(number1, number2, decider);
    System.out.println(calculatorOutput);
  }
}
