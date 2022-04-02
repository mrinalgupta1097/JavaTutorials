package com.mrinalgupta.day8;

public class TemporaryEmployee extends Employee {
  private Float servicePeriod;

  public TemporaryEmployee(
      int employeeId, String employeeName, double baseSalary, float servicePeriod) {
    super(employeeId, employeeName, baseSalary);
    this.servicePeriod = servicePeriod;
  }

  public Float getServicePeriod() {
    return servicePeriod;
  }

  public void setServicePeriod(float servicePeriod) {
    this.servicePeriod = servicePeriod;
  }

  //  public void calculateSalaryHike() {
  //    Float salaryHike =
  //        (float) (this.getBaseSalary() * (this.getServicePeriod() * 2 * 0.01)); // type
  // conversion
  //    System.out.println("Salary Hike : " + salaryHike);
  //  }

  @Override
  public void calculateSalaryHike() {
    Float salaryHike =
        (float) (this.getBaseSalary() * (this.getServicePeriod() * 2 * 0.01)); // type conversion
    System.out.println("Salary Hike : " + salaryHike);
  }

//  Static and final methods cannot be overridden.

}
