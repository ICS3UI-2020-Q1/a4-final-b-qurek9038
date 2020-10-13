import java.util.Scanner;
/**
 *This program prompts the user to enter in a positive integer. It will then calculate the sum of all of the digits in that integer
 * @author Khazina Qureshi
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user for a positive integer
    System.out.println("Please enter a positive integer to add the digits of:");

    //Store user input using variable 
    int positiveNum = input.nextInt();

    //Check to make sure it is a positive integer
    while (positiveNum <= 0){
      //Ask again for a positive integer if user entered a negative integer
      System.out.println("That number is not a positive integer. Please try again!");
      positiveNum = input.nextInt();
    }
    //Pre looping code
    int sum = 0;
    while (positiveNum > 0){
      //Pull integer into different pieces using modulus and division operations in the loop
      sum = sum + positiveNum % 10;
      positiveNum = positiveNum / 10;
    }
    //Display the sum of the digits to user 
    System.out.println("The sum of these digits is " + sum);
 
  }
}
