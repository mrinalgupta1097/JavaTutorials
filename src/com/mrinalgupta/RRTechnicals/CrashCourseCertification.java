package com.mrinalgupta.RRTechnicals;

public class CrashCourseCertification extends RRTechnicalCertification {
  public CrashCourseCertification(String studentName, String courserName, int admissionTestMarks) {
    super(studentName, courserName, admissionTestMarks);
  }

  @Override
  public void registrationId() {
    String registrationIdInString = Integer.toString(1002) + counter;
    int registrationId = Integer.parseInt(registrationIdInString);
    this.setRegistrationId(registrationId);
  }

  @Override
  public double calculateFee() {
    double totalFeeAfterDiscount = 0.0;
    double totalFeeAfterServiceTax;
    if (this.getAdmissionTestMarks() >= 90) {
      totalFeeAfterDiscount =
          Certification.CRASH_COURSE_FEE - (Certification.CRASH_COURSE_FEE * 0.1);
    } else if (this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() < 90) {
      totalFeeAfterDiscount =
          Certification.CRASH_COURSE_FEE - (Certification.CRASH_COURSE_FEE * 0.05);
    }
    totalFeeAfterServiceTax = totalFeeAfterDiscount + (totalFeeAfterDiscount * 0.1236);
    return totalFeeAfterServiceTax;
  }
}
