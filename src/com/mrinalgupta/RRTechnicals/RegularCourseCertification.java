package com.mrinalgupta.RRTechnicals;

public class RegularCourseCertification extends RRTechnicalCertification {

  private int courseDuration;

  public RegularCourseCertification(
      String studentName, String courserName, int admissionTestMarks, int courseDuration) {
    super(studentName, courserName, admissionTestMarks);
    this.courseDuration = courseDuration;
  }

  public int getCourseDuration() {
    return courseDuration;
  }

  public void setCourseDuration(int courseDuration) {
    this.courseDuration = courseDuration;
  }

  @Override
  public void registrationId() {
    System.out.println("generate");
    String registrationIdInString = Integer.toString(1001) + counter;
    int registrationId = Integer.parseInt(registrationIdInString);
    this.setRegistrationId(registrationId);
  }

  @Override
  public double calculateFee() {
    double totalFeeAfterDiscount = 0.0;
    if (this.getAdmissionTestMarks() >= 90) {
      totalFeeAfterDiscount =
          (Certification.REGULAR_COURSE_FEE * this.getCourseDuration())
              - (Certification.REGULAR_COURSE_FEE * this.getCourseDuration() * 0.1);
    } else if (this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() < 90) {
      totalFeeAfterDiscount =
          (Certification.REGULAR_COURSE_FEE * this.getCourseDuration())
              - (Certification.REGULAR_COURSE_FEE * this.getCourseDuration() * 0.05);
    }
    return totalFeeAfterDiscount;
  }
}
