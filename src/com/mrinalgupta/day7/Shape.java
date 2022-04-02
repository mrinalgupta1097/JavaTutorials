package com.mrinalgupta.day7;

public class Shape {

  private static final float valueOfPie = 3.14f;
  //    calculate area of circle
  public float calculateArea(float radius) {
    return valueOfPie * radius * radius;
  }

  //    calculate area of rectangle
  public float calculateArea(float length, float breadth) {
    return length * breadth;
  }
//
//  public float calculateVolume(float length, float breadth, float height){
//    return calculateArea(length,breadth) * height;
//  }

}

class Tester {
  public static void main(String[] args) {
    Shape shape = new Shape();
    float circleArea = shape.calculateArea(2.5f);
    System.out.println(circleArea);
    float rectangleArea = shape.calculateArea(2.5f, 5.7f);
    System.out.println(rectangleArea);
  }
}
