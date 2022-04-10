package com.mrinalgupta.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
  public static void main(String[] args) {
    //
    List<Integer> numbers = new ArrayList<>();
    numbers.add(4);
    numbers.add(2);
    numbers.add(6);
    numbers.add(1);
    numbers.add(5);
    numbers.add(3);

    List<Integer> newList = new ArrayList<>();
    newList.add(25);
    newList.add(50);

    //      add num at particular index
    numbers.add(2, 15);
    System.out.println("Observe the second index : " + numbers.get(2));
    // empty check
    System.out.println("Check if the list i empty : " + numbers.isEmpty());
    //    add list to list
    numbers.addAll(newList);
    //    check for existence
    System.out.println(numbers.contains(7));
    System.out.println(numbers);
    int i = numbers.indexOf(5);
    System.out.println(i);

    //    collections class methods
    Collections.sort(numbers);
    System.out.println(numbers);

    Collections.reverse(numbers);
    System.out.println(numbers);

    Integer maximum = Collections.max(numbers);
    System.out.println(maximum);

    Integer minimum = Collections.min(numbers);
    System.out.println(minimum);
  }
}
