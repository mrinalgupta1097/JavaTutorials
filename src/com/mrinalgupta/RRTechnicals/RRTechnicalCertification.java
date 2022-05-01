package com.mrinalgupta.RRTechnicals;

public class RRTechnicalCertification implements Certification {
  //    variables
  private String studentName;
  private String courserName;
  private int registrationId;
  private int admissionTestMarks;
  public static int counter = 0;

  //   Parametertised Constructor

  public RRTechnicalCertification(String studentName, String courserName, int admissionTestMarks) {
    this.studentName = studentName;
    this.courserName = courserName;
    this.admissionTestMarks = admissionTestMarks;
    counter++;
  }

  //  getter and setter

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getCourserName() {
    return courserName;
  }

  public void setCourserName(String courserName) {
    this.courserName = courserName;
  }

  public int getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(int registrationId) {
    this.registrationId = registrationId;
  }

  public int getAdmissionTestMarks() {
    return admissionTestMarks;
  }

  public void setAdmissionTestMarks(int admissionTestMarks) {
    this.admissionTestMarks = admissionTestMarks;
  }

  //    generateRegistrationId() method
  public void registrationId() {

  }

  @Override
  public double calculateFee() {
    return 0;
  }
}
