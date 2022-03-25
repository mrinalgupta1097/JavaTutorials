package com.mrinalgupta.day5;

public class ForLoop {
  public static void printNumbers() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  public static void printTable(int number) {
    for (int i = 1; i <= 10; i++) {
      int result = number * i;// 11*1,11*2,....11*10..11*11
      System.out.println(result);
    }
  }

  public static void printTableWhileLoop(int number) {
    int i = 1;
    while (i <= 10) {
      int result = number * i;
      System.out.println(result);
      i++;
    }
  }

  public static void main(String[] args) {
    //    ForLoop.printNumbers();
//    ForLoop.printTable(7);
    ForLoop.printTableWhileLoop(8);
  }
}
