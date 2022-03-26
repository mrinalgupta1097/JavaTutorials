package com.mrinalgupta.day6;

public class StringDemo {
     /*"12324", "@!#Java"
     1.Built in class in Java.
     2. Strings in Java are immutable.
     String name = "Ravi";
     3. Creating Strings
        3.1 Literals
        String name = "Jasmine";//Inline declaration
        3.2 using new() keyword
        String customerName = new String("Jasmine");

        DeLhi ->  delhi = delhi

    */
     public static void main(String[] args) {
//         String name = "JASMINE";
//         String name1 = "Jasmine";
//         System.out.println(name.equalsIgnoreCase(name1));
//         String customerName = new String("Jasmine");
//         String customerName1 = new String("Jasmine");
//
//         System.out.println("literals : " + customerName);
//         System.out.println("new keyowrd : " + customerName);
//         System.out.println(name == customerName);//object reference
//         System.out.println(name.equals(customerName));// object data
//         System.out.println(customerName == customerName1);
//         System.out.println(customerName.equals(customerName1));

//         String methods
         String firstString = "Java";
         String secondString = new String("Stream");

//         concatenation
         System.out.println(firstString.concat(secondString));
         System.out.println(firstString.concat(" ").concat(secondString));// chaining concatenation

        String car = "MercEdeS";
         System.out.println("upper case : " +  car.toUpperCase());
         System.out.println("lower case :" + car.toLowerCase());
         System.out.println("starts with : " + car.startsWith("Mer"));
         System.out.println("ends with : " + car.endsWith("deS"));
         System.out.println("contains search :" + car.contains("rcE"));
         System.out.println("empty check : " + car.isEmpty() );// ""
         System.out.println("length : " + car.length());
         System.out.println("-------------------------------------------");

         String forest = "Grand Canyon National Park";
         System.out.println();
         System.out.println("substring(2,6) of forest :" + forest.substring(2,7));
         System.out.println();
         String[] words = forest.split(" ");
         for(String w : words){
             System.out.println(w);
         }
         System.out.println();

         System.out.println(forest.indexOf("america"));

         System.out.println();
         String s1 = "  Amazon  ";
         System.out.println("trimmed sting : " + s1.trim());

         System.out.println(s1.repeat(5));

         //stringBuilder & StringBuffer


     }


}
