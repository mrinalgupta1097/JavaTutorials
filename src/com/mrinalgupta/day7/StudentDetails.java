package com.mrinalgupta.day7;

public class StudentDetails {
    private String name;
    private Integer rollNumber;
    private String phoneNumber;
    private String email;

//constructor used when no name is given
    public StudentDetails() {
        name = "N.A.";
        rollNumber = -1;
    }

//    constructor used when phoneNumber is not given


    public StudentDetails(String name, Integer rollNumber, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
    }

    public StudentDetails(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}
