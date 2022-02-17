
/* The LoggingCompany  program implements an application that

* Asks the user for the length of the logs and outputs the amount of logs

* That can fit on the logging truck

*

* @author  Jonathan Kene

* @version 1.0

* @since   2022-02-17

*/

import java.util.Scanner;

class LoggingCompany {
  public static void main(String[] args) {

    double truckSize = 1100;

    Scanner input = new Scanner(System.in);
    System.out.print("What is the length of the logs you’re adding? ");
    double length = input.nextDouble();
    double amount = truckSize / (20 * length);
    System.out.println("You can fit " + amount + " logs on the truck");

    input.close();
  } 
}
