package com.mrinalgupta.day7;

public class CarStore {
  /*
  Polymorphism -> poly(many) + morphism(morphed -> modified)
    compile time & run time polymorphism
    overloading     overriding

      overloading -> change the no of input parameters, type of input parameters
                    method overloading, constructor overloading
   */
  public void searchCar(String manufacturer) {
    System.out.println("tata");
  }

  public int searchCar(float topSpeed) {
    return 0; // covariant type
  }

  public void searchCar(float topSpeed, String color) {
    System.out.println("top speed : " + topSpeed + " , Color : " + color);
  }
}
