package com.mrinalgupta.day11;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    //
    Queue<String> queueDemo = new PriorityQueue<>();
    queueDemo.add("Aman");
    queueDemo.add("Vijay");
    queueDemo.add("Raaj");
    queueDemo.add("shahrukh");
    System.out.println(queueDemo.element());
    System.out.println(queueDemo.peek());

    queueDemo.remove();
    queueDemo.poll();
    for (String str : queueDemo) {
      System.out.println(str);
      //      use add or poll not remove or offer because they throw exceptions
    }
  }
}
