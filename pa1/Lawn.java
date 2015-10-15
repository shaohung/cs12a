// Lawn.java
// Shao-Hung Hsiao
// shsiao2
// pa1
// calculate the area and mowing time based on user's input

import java.util.Scanner;

class Lawn {
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    double lot_length, lot_width, house_length, house_width, rate;
    double area, mowing_sec;
    int hour, minute, second;

    System.out.print ("Enter the length and width of the lot, in feet: ");
    lot_length = sc.nextDouble();
    lot_width = sc.nextDouble();

    System.out.print ("Enter the length and width of the house, in feet: ");
    house_length = sc.nextDouble();
    house_width = sc.nextDouble();

    area = (lot_length * lot_width) - (house_length * house_width);

    System.out.println ("The lawn area is " + area + " square feet.");

    System.out.print ("Enter the mowing rate, in square feet per second: ");
    rate = sc.nextDouble();

    mowing_sec = area / rate;

    second = (int) Math.round(mowing_sec);
    minute = second / 60;
    second = second % 60;
    hour = minute / 60;
    minute = minute % 60;

    System.out.println ("The mowing time is "
                        + hour + (hour == 1 ? " hour " : " hours ")
                        + minute + (minute == 1 ? " minute " : " minutes ")
                        + second + (second == 1 ? " second.": " seconds."));

    }
}
