package com.mrinalgupta.day9.Miscalleneous.abstraction;

public class Tester {
  public static void main(String[] args) {
    //

     Automobile nexon =  new Car();
     nexon.setVehileNo("UP16 XYZ 1234");
     Automobile r15 = new Bike();
     r15.setVehileNo("UP16 XYZ 2345");
     startAutomobile(nexon);
     startAutomobile(r15);

  }

  public static void startAutomobile(Automobile automobile){
      automobile.start();
      automobile.stop();
  }
}
