package com.mrinalgupta.day8;

public class PermanentEmployee extends Employee {
  private String designation;
  private Integer hikePercent;

  //  public PermanentEmployee(
  //      Integer employeeId,
  //      String employeeName,
  //      Double baseSalary,
  //      String designation,
  //      Integer hikePercent) {
  //    super(employeeId, employeeName, baseSalary);
  //    this.designation = designation;
  //    this.hikePercent = hikePercent;
  //  }

  public PermanentEmployee(
      Integer employeeId, String employeeName, Double baseSalary, String designation) {
    super(employeeId, employeeName, baseSalary);
    this.designation = designation;
    this.hikePercent = 12;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Integer getHikePercent() {
    return hikePercent;
  }

  public void setHikePercent(int hikePercent) {
    this.hikePercent = hikePercent;
  }

  //  public void calculateSalaryHike() {
  //    Float salaryHike =
  //        (float) (this.getBaseSalary() * this.getHikePercent() * 0.01); // type conversion
  //    System.out.println("Salary Hike : " + salaryHike);
  //  }

  @Override
  public void calculateSalaryHike() {
    Float salaryHike =
        (float) (this.getBaseSalary() * this.getHikePercent() * 0.01); // type conversion
    System.out.println("Salary Hike : " + salaryHike);
  }

  /*
  Annotations : they provide extra information to jvm.
   */
}
