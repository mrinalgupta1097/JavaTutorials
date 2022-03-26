package com.mrinalgupta.day7;

public class EmployeeManagement {
    private int id;
    private String name;
    private String phoneNumber;
    private static int noOfEmplolyee;

    public EmployeeManagement(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        noOfEmplolyee++;
    }

  public static void main(String[] args) {
    EmployeeManagement employee1 = new EmployeeManagement(001, "xyuz", "1236768");
    EmployeeManagement employee2 = new EmployeeManagement(002,"djsdhjs", "1676767");

    System.out.println(EmployeeManagement.noOfEmplolyee);
  }
}
