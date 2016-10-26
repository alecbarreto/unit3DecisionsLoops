import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Sum and Average
     * reads a series of numbers (ends with a letter)
     * calculates the sum and average of the numbers
     * prints the sum and average
     */
    public static void sumAndAverage()
    {
        Scanner s = new Scanner( System.in );
        double sum = 0;
        double average = 0;
        int count = 0;
        
        System.out.println( "Enter a series of numbers (any letter to quit)" );
        
        while( s.hasNextDouble())
        {
            double value = s.nextDouble();
            sum += value;
            count++;
        }
        
        if( count > 0 )
        {
            average = sum / count;
        }
        
        System.out.println( "sum: " + sum + " average: " + average );
    }
    
    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * prints the count
     * 
     * GREEN GROUP
     */
    public static void countMatches()
    {
    }
    
    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * prints the number of words read before the match
     * 
     * RED GROUP
     */
    public static void findFirstMatch()
    {
    }
    
    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * prints the number that matched the criteria
     * 
     * ORANGE GROUP
     */
    public static void promptUntilMatch()
    {
    }
    
    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * prints the greatest number
     * 
     * BLUE GROUP
     */
    public static void findMax()
    {
    }
    
    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * prints the least number
     * 
     * BLUE GROUP
     */
    public static void findMin()
    {
    }
    
    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * prints a message if an adjacent duplicate number is entered and exits the loop
     * 
     * PURPLE GROUP
     */
    public static void compareAdjacent()
    {
    }
    
    
}
