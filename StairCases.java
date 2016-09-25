/**
 * This class takes a user-inputed number and prints out a staircases, one asceding to the specified number and one descending away from it
 *@author Tom Drzik
 *@version 0.1
 */

import java.util.Scanner;

public class StairCases
{
  /**
   * Main method demonstrates the other wo methods by calling each of them.
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Type the number of rows you want");
    int size = keyboard.nextInt();
    printAscending(size);
    printDescending(size);
  }

  /**
   * This method will print rows of Xs until it reaches the specified number
   */
  public static void printAscending(int size)
  {
      for (int x = 1; x <= size; x++;)
          System.out.print("x");
      
      System.out.println();
      
      printAscending(size);
    
        
  }

  
      
/**
   * Write your javadoc here
   */
  public static void printDescending(int size)
  {
      
  }
  //TODO Finish this method
}
