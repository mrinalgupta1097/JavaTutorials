package com.mrinalgupta.RRTechnicals;

public class Tester {
  public static void main(String[] args) {
    //
    RegularCourseCertification regularStudent1 =
        new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
    System.out.println("Regular Course Registration Details");
    System.out.println("************************************");
    System.out.println();
    System.out.println("Student Name    : " + regularStudent1.getStudentName());
    System.out.println("Course Name     : " + regularStudent1.getCourserName());
    System.out.println("Course Duration : " + regularStudent1.getCourseDuration() + " months");
    System.out.println("Registration Id : " + regularStudent1.getRegistrationId());
    System.out.println("Fees            : " + regularStudent1.calculateFee());
  }
}
