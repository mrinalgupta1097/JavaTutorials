package com.mrinalgupta.day9.Miscalleneous.abstraction;

public class Bike extends Automobile {

  @Override
  public void start() {
    System.out.println("Bike : " + getVehileNo() + " has started.");
  }

  @Override
  public void stop() {
    System.out.println("Bike : " + getVehileNo() + " has stopped.");
  }
}
