// Guess2.java
// Shao-Hung Hsiao
// shsiao2
// pa2
// An interactive guessing game with user

import java.util.Scanner;

class Guess2 {
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    int answer = (int) (Math.random() * 10 + 1);
    int number;
    int count = 1;
    boolean win = false;

    System.out.println ("\nI'm thinking of an integer in the range 1 to 10. You
                        have three guesses.\n");

    while (win == false && count <= 3) {
      if (count == 1) {
        System.out.print ("Enter your first guess: ");
      }
      if (count == 2) {
        System.out.print ("Enter your second guess: ");
      }
      if (count == 3) {
        System.out.print ("Enter your third guess: ");
      }

      number = sc.nextInt();

      if (number > answer) {
        System.out.println ("Your guess is too high.\n");
        count++;
      }
      if (number < answer) {
        System.out.println ("Your guess is too low.\n");
        count++;
      }
      if (number == answer) {
        win = true;
        System.out.println ("You win!\n");
      }

      if (count > 3) {
        System.out.println ("You lose. The number was " + answer + ".\n");
      }

    }

  }
}
