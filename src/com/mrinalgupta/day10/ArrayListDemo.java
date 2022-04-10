package com.mrinalgupta.day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

  private static List<String> food;

  public static void main(String[] args) {
    //
    food = new ArrayList<>();
    food.add("Pizza");
    food.add("Burger");
    food.add("Fries");
    food.add("Sandwich");
    addElements("Pasta");

    // print the arrayList
    System.out.println(food);
    //    get element from specified index
    System.out.println(food.get(1));
    //    get size of arrayList
    System.out.println("Size of food array is : " + food.size());

    //    iterate over list
    for (int i = 0; i <= food.size() - 1; i++) {
      System.out.println(food.get(i));
    }

    for (String temp : food) {
      System.out.println(temp); // insertion is preserved
    }
  }

  public static void addElements(String addThis) {
    food.add(addThis);
  }
}
