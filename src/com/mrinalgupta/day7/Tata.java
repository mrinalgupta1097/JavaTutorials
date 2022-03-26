package com.mrinalgupta.day7;

public class Tata {
    private static final String factoryId = "TATA001";
    private String modelNumber;
    private String color;
    private String bookingId;
    private static int noOfCars;// counting the cars

    /*
    1. static keyword is used to make a member belong to the class and not to any
        of its individual objects.
    2. only one copy is maintained across all objects.
    3. static -> varibales, methods, blocks.
        static{
        ----------
        ----------
        ----------
        }
     4.
     */

    public Tata(String modelNumber, String color){
        this.modelNumber = modelNumber;
        this.color = color;
        noOfCars++;// incrementing the count
    }

  // modelNumber = 1, color = blue;
  // modelNumber = 2, color = grey;

//    public static void generateBookingId(){
//        this.bookingId = "UP16" + noOfCars; // static blocks and static methods cannot access non-static members directly.
    // non static members can access static members.
//    }

  public static void main(String[] args) {
    //
      Tata car1 = new Tata("nexonEV", "grey");
      Tata car2 = new Tata("nexonPetrol", "black");
    System.out.println(Tata.noOfCars);
  }
}
