package com.mrinalgupta.day8;

public class Tester {
  public static void main(String[] args) {
    //
    PermanentEmployee permanentEmployee1 = new PermanentEmployee(101, "John", 28000.0, "lead");
    permanentEmployee1.display();// calling parent class method
    System.out.println("Designation : " + permanentEmployee1.getDesignation());// calling same class variables
    permanentEmployee1.calculateSalaryHike();// calling same class method

    System.out.println("------------------------------");
    TemporaryEmployee temporaryEmployee1 = new TemporaryEmployee(102, "Ross", 30000.0, 2.5f);
    temporaryEmployee1.display();// calling parent class method
    System.out.println("Service Duration (in years) : " + temporaryEmployee1.getServicePeriod());
    temporaryEmployee1.calculateSalaryHike();

    System.out.println();
  }
}
