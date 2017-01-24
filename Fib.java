// Author: Michael Hawes
// simple fibinocci sequence in Java

public class Fib{

  public static void main(String[] args){
    for (int i=0; i<30; i++) {              // use numbers in range of 30
      System.out.println(Fib.fib(i));
    }
  }

  public static int fib(int i){
    if (i == 0) {
      return 0;       // base case 0
    }
    else if (i == 1) {
      return 1;       // base case 1
    }
    else{
      return fib(i-1) + fib(i-2);  // return the sum of two previous numbers
    }
  }
}
