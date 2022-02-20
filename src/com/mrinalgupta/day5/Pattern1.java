package com.mrinalgupta.day5;

public class Pattern1 {
  public static void pyramidPattern(int n) {
    //      number of rows : outer loop
    for (int i = 0; i < n; i++) {
      //      print the Space
      System.out.println(" ");
//      inner loop for columns
      for (int j = 0; j <= i; j++) {
//        print the star
        System.out.println("* ");
      }
    }

    System.out.println();
  }

  public static void main(String[] args) {
    //
    Pattern1.pyramidPattern(5);
  }
}
