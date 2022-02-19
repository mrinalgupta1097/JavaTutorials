package com.mrinalgupta.day4;

public class IfExample {
  //    WAP to check if number is even, if it is not then print the square of the number.

  /*
  If else structure
  if(condition){
    statement1;
  }
  else{
    statement1;
  }
   */
  public static void checkEven(int n) {
    if (n % 2 == 0) { // the outcome of if is either true or false.
//      int x = n * n;
      System.out.println("number is even " + n*n);
    } else {
//      int x = n * n;
      System.out.println("the number is odd " + n*n);
    }
  }

  public static void main(String[] args) {
    checkEven(6);
  }
}
