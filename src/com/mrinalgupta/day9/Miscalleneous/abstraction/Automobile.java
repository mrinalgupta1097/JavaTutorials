package com.mrinalgupta.day9.Miscalleneous.abstraction;

public abstract class Automobile {
  private String vehileNo;

  public String getVehileNo() {
    return vehileNo;
  }

  public void setVehileNo(String vehileNo) {
    this.vehileNo = vehileNo;
  }

  public abstract void start();

  public abstract void stop();
}
