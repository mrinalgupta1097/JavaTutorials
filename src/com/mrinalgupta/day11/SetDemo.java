package com.mrinalgupta.day11;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
  public static void main(String[] args) {
    //
    HashSet<String> setDemo = new HashSet<>();

    //      adding elements
    setDemo.add("New Delhi");
    setDemo.add("Washington DC");
    setDemo.add("Amsterdam");
    setDemo.add("Dhaka");
    setDemo.add("Paris");
    setDemo.add("Berlin");

    //      iterating
    for (String city : setDemo) {
      System.out.println(city);
    }

    //    using internal iterator
    Iterator<String> city = setDemo.iterator();

    while (city.hasNext()) {
      System.out.println(city.next());
    }
  }
}
