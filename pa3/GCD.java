// GCD.java
// Shao-Hung Hsiao
// shsiao2
// pa3
// find the GCD of two numbers

import java.util.Scanner;

class GCD {
  public static void main (String [] args) {

    Scanner sc = new Scanner (System.in);
    int a, b, temp, r = 1, a2, b2;
    String q1 = "Enter a positive integer: ";
    String q2 = "Enter another positive integer: ";
    String q3 = "Please enter a positive integer: ";

    System.out.print (q1);
      while(true){
        while(!sc.hasNextInt()) {
          sc.next();
          System.out.print(q3);
        }
        a = sc.nextInt();
        a2 = a;
        if(a > 0) break;
        System.out.print(q3);
    }

    System.out.print(q2);
      while(true) {
        while(!sc.hasNextInt()) {
          sc.next();
          System.out.print(q3);
        }
        b = sc.nextInt();
        b2 = b;
        if(a > 0) break;
        System.out.print(q3);
    }

    if (a < b) {
      temp = b;
      b = a;
      a = temp;
    }

    while (r != 0) {
      r = a % b;
      a = b;
      b = r;
    }

    System.out.println ("The GCD of " + a2 + " and " + b2 + " is " + a + "\n");


  }
}
