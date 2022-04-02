package com.mrinalgupta.day8.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Tester {
  public static void main(String[] args) {
    // Today's date in YYYY-MM-DD(default format)
    LocalDate today = LocalDate.now();
    System.out.println("Today's date : " + LocalDate.now().getDayOfMonth());
    System.out.println("Month : " + LocalDate.now().getMonth());
    System.out.println("Month value: " + LocalDate.now().getMonth().getValue());
    System.out.println("Month value after 7 months: " + LocalDate.now().plusMonths(9));
    System.out.println(today);

    //    print date in specified format : use of()
    System.out.println(LocalDate.of(2018,8,29));
    System.out.println(LocalDate.of(2018, Month.APRIL, 29));

    //    access dates
    System.out.println("Date Time Formatter");
    LocalDate date = LocalDate.parse("13 Feb, 2020", DateTimeFormatter.ofPattern("dd MMM, yyyy"));
    System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
  }
}
