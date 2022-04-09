package com.mrinalgupta.day9.Miscalleneous.abstraction;

public class Car extends Automobile {

  @Override
  public void start() {
    System.out.println("Car : " + getVehileNo() + " has started.");
  }

  @Override
  public void stop() {
    System.out.println("Car : " + getVehileNo() + " has stopped.");
  }
}
