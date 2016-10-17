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
    System.out.println();
    int counter = 1;
    printDescending(size, counter);
  }

  /**
   * This method will print rows of Xs until it reaches 0
   *@param size the number of rows and number of xs in largest row
   */
  public static void printAscending(int size)
  {  int counter = 0;
     System.out.println();
     while (counter < size)
     {
        System.out.print("x");
        counter++;
        
         
     }
    
    if (size > 0 )
        printAscending(--size);
 
    else
        System.out.println();
    
     
    
        
  }

  
      
/**
   * This method will print rows of Xs until it reaches the desired amount
   *@param size the number of rows and number of xs in largest rows
   *@param counter the number of xs in the current row
   */
  public static void printDescending(int size, int counter)
  {  
    if (counter <= size)
    {
      int counter2 = counter;
      while (counter2 > 0)
      {
          System.out.print("x");
          --counter2;
          
      }
        
      System.out.println();    
      printDescending(size, ++counter);  
        
    
      
      
     
    
          
      
    }
    
  //TODO Finish this method
  }
    
        
}
