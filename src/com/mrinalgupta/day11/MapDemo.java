package com.mrinalgupta.day11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    //

    Map<String, Integer> groceries = new HashMap<>();
    groceries.put("Kurkure",10);
    groceries.put("Maggie", 12);
    groceries.put("Juice", 5);
    groceries.put("Eggs", 30);

    System.out.println(groceries);

    for (Map.Entry grocery : groceries.entrySet()){
      System.out.println("key : " +  grocery.getKey() +" , value : " + grocery.getValue());
    }

    for (String grocery : groceries.keySet()){
      System.out.println(grocery);
    }
  }
}
