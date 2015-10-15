// Guess.java
// Shao-Hung Hsiao
// shsiao2
// pa2
// An interactive guessing game with user

import java.util.Scanner;

class Guess {
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    int answer = (int) (Math.random() * 10 + 1);
    int number = 0, count = 0;

    System.out.println ("\nI'm thinking of an integer in the range 1 to 10. You have three guesses.\n");

    if (number != answer) {
      System.out.print ("Enter your first guess: ");
      number = sc.nextInt();
      count++;
      if (number > answer) {
        System.out.println ("Your guess is too high.\n");
      } else if (number < answer) {
        System.out.println ("Your guess is too low.\n");
      }
    }

    if (number != answer) {
      System.out.print ("Enter your seocnd guess: ");
      number = sc.nextInt();
      count++;
      if (number > answer) {
        System.out.println ("Your guess is too high.\n");
      } else if (number < answer) {
        System.out.println ("Your guess is too low.\n");
      }
    }

    if (number != answer) {
      System.out.print ("Enter your third guess: ");
      number = sc.nextInt();
      count++;
      if (number > answer) {
        System.out.println ("Your guess is too high.\n");
      } else if (number < answer) {
        System.out.println ("Your guess is too low.\n");
      }
    }

    if (number == answer) {
      System.out.println ("You win!\n");
    } else if (count == 3) {
      System.out.println ("You lose. The number was " + answer + ".\n");
    }

  }
}
