package com.mrinalgupta.day8;

public class ToStringDemo {
    private String flatNo;
    private String tower;

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getTower() {
        return tower;
    }

    public void setTower(String tower) {
        this.tower = tower;
    }

    public ToStringDemo(String flatNo, String tower) {
        this.flatNo = flatNo;
        this.tower = tower;
    }

    @Override
    public String toString() {
        return "ToStringDemo{" +
                "flatNo='" + flatNo + '\'' +
                ", tower='" + tower + '\'' +
                '}';
    }
}
