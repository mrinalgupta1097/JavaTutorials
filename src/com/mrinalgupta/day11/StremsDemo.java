package com.mrinalgupta.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremsDemo {
  public static void main(String[] args) {
    //
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);

    for (int i = 0; i <= numbers.size() - 1; i++) {
      if (numbers.get(i) % 2 == 0) {
        System.out.println(numbers.get(i) * numbers.get(i));
      }
    }
    System.out.println("----------------------By stream-------------------");
    List<Integer> filteredNumbers =
        numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

    System.out.println(filteredNumbers);
  }
}
