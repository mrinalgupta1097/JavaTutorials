package infyjava.interviewQuestions;

import java.util.Scanner;

public class Calculator {
  public static int sum(int num1, int num2) {
    return num1 + num2;
  }

  public static int subtract(int num1, int num2) {
    int result = 0;
    if (num1 > num2) {
      result = num1 - num2;
    } else {
      result = num2 - num1;
    }
    return result;
  }

  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public static float divide(int num1, int num2) {
    int result = 0;
    if (num1 > num2) {
      result = num1 / num2;
    } else {
      result = num2 / num1;
    }
    return result;
  }
}

class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = sc.nextInt();
    System.out.println("Enter second number");
    int num2 = sc.nextInt();

    System.out.println("num1 : " + num1 + " , num2 : " + num2);
    System.out.println(" sum is : " + Calculator.sum(num1, num2));
    System.out.println(" subtract is : " + Calculator.subtract(num1, num2));
  }
}
