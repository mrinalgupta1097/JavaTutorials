package com.mrinalgupta.day3;

public class MobileClassBasics {

// properties
    private int price;
    private String brand;

    /*
        Constructor : constructs object for the specified class.
         : requires input for properties.
        Non-parameterized : does not require any input, provided by default by java.
         *** If you define Parameterized constructor , non parameterized constructor does not provided by java.
         */
//    Non-Parameterized Constructor
    public MobileClassBasics() {
    }

    //    Parameterized Constructor
    public MobileClassBasics(int inputPrice, String inputBrand) {
        this.price = inputPrice;
        this.brand = inputBrand; // this -> this object
    }

    /*
    Getters : used to fetch the values/properties. Do not take any input.
    Setters : used to set/update the values/properties. Do not return anything and take input for property.
     */
    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int updatedPrice){
        this.price = updatedPrice;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(){
        System.out.println("Calling from..." + this.brand);
//        printing on the console != return.

    }

    public void torchlight(){
        System.out.println("torchlight on");
    }








}

class Demo{
  public static void main(String[] args) {
      MobileClassBasics mob1 = new MobileClassBasics(2000, "Samsung");
      System.out.println("mob1 price : " + mob1.getPrice());
    MobileClassBasics mob2 = new MobileClassBasics(2000, "Apple");
    System.out.println("mob2 brand : " + mob2.getBrand());
    mob2.setPrice(100000);
    System.out.println("updated price is : " + mob2.getPrice());
    mob2.call();
    mob1.call();

//      MobileClassBasics mob1 = new MobileClassBasics();
//      mob1.setPrice(2000);
//      mob1.setBrand("Samsung");
//    System.out.println(mob1.getPrice());
//    System.out.println(mob1.getBrand());
//      MobileClassBasics mob4 = mob1;
//    System.out.println(mob4 == mob1);
//
//    MobileClassBasics mob3 = mob1;
//    System.out.println(mob3== mob4);
  }
}
