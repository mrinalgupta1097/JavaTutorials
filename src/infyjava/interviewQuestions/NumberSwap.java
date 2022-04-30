package infyjava.interviewQuestions;

public class NumberSwap {
  public static void main(String[] args) {
    //
    int a = 5;
    int b = 3;
    System.out.println("a = " + a + " , b = " + b);
//    int temp;
//    temp = a; // temp = 5, a = 5, b = 3
//    a = b;
//    b = temp;
//    System.out.println("a = " + a + " , b = " + b);

//     without third variable
    a = a + b;// a = 8, b = 3
    b = a - b;// a = 8, b = 5
    a = a - b;
    System.out.println("a = " + a + " , b = " + b);


  }
}
// even number, prime number, leap year, divisible by 3 and 5;