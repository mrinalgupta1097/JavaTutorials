package com.mrinalgupta.day5;

public class Pattern1 {
  public static void pyramidPattern(int n) {
    //      number of rows : outer loop
    for (int i = 1; i <= n; i++) {
      //      print the Space
      System.out.println(" ");
//      inner loop for columns
      for (int j = 1; j <= i; j++) {
//        print the star
        System.out.println( j + " ");
      }
    }

    System.out.println();
  }

  public static void main(String[] args) {
    //
    Pattern1.pyramidPattern(5);
  }
}
