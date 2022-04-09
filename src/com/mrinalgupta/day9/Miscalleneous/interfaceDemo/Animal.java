package com.mrinalgupta.day9.Miscalleneous.interfaceDemo;

public class Animal implements Lion {

  @Override
  public void eats() {
    System.out.println("eating all day.");
  }

  @Override
  public void run() {
    System.out.println("running around");
  }
//  can also have its own methods
}
