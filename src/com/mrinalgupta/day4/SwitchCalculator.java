package com.mrinalgupta.day4;

import java.util.Scanner;

public class SwitchCalculator {
  public static int switchCaseCalculator(int number1, int number2, int decider) {
    int result = 0;
    switch (decider) {
      case 1:
        System.out.println("performing addition as case is 1");
        result = number1 + number2;
        break;
      case 2:
        System.out.println("performing subtraction as case is 2");
        result = number1 - number2;
        break;
      case 3:
        System.out.println("performing multiplication as case is 3");
        result = number1 * number2;
        break;
      case 4:
        System.out.println("performing division as case is 4");
        result = number1 / number2;
        break;
      default:
        System.out.println("Enter a number between 1 to 4.");
    }
    return result;
  }
}

class SwitchTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number : ");
    int number1 = sc.nextInt();
    System.out.println("Enter second number : ");
    int number2 = sc.nextInt();
    System.out.println("enter a decider value : ");
    int decider = sc.nextInt();
    int output = SwitchCalculator.switchCaseCalculator(number1, number2, decider);
    System.out.println(output);
  }
}
