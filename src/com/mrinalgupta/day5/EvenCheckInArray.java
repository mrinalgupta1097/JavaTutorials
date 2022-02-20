package com.mrinalgupta.day5;

public class EvenCheckInArray {
  public static void evenCheck(int[] numbers) {
    //        arrayName.length gives the length of an array.
    //      arrayName[indexPosition] gives the element at that index.

    for (int i = 0; i <= numbers.length-1; i++) {
      System.out.println(numbers[i]);
    }
  }

  public static void main(String[] args) {
    int[] numbers = new int[5];
    //      add elements to the array
    numbers[0] = 1;
    numbers[1] = 3;
    numbers[2] = 5;

    EvenCheckInArray.evenCheck(numbers);
    System.out.println("updated array");
    numbers[1] = 7;
    EvenCheckInArray.evenCheck(numbers);
//    Access static methods by class name : ClassName.methodName;
  }
}
