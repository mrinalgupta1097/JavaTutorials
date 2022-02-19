package com.mrinalgupta.day2;

public class OperatorDemo {
    public static int checkEven(int input){

        if(input % 2 ==0){
            return input;
        }
        else{
            System.out.println("odd");
        }

        return 0;
    }
  public static void main(String[] args) {
    //

      checkEven(6);
  }
}
