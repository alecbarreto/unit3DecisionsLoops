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
        Scanner s = new Scanner(System.in); 
        int count  = 0; 
        int value = 0;
        String again = "y";
        while (again == "y")
        {
            System.out.println("Enter a Number(type a letter to exit): ");
            if (s.hasNextInt() == false)
            {
                break; 

            }
            value = s.nextInt(); 
            if (value>= 100)
            {
                count++;
            }
        }
        System.out.println("The amount of numbers you entered that are over 100: "+count);
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
        Scanner s = new Scanner(System.in);
        int count = 0;
        boolean doIt = true;

        System.out.println("Reads and counts words whose lengths are" + 
            " less than or equal to five characters");
        System.out.println("To exit, type a word with more than 5" + 
            " characters");

        if(doIt)
        {
            while(s.hasNext())
            {
                if(s.hasNextDouble() || s.hasNextInt())
                {
                    doIt = false;
                }
                System.out.print(": ");
                String input = s.next();
                if(input.length() > 5)
                {
                    break;
                }
                count += 1;
            }
        }

        System.out.println("There were " + count + " words that "
            + "were less than or equal to five characters");
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
        Scanner s = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter a few numbers, > 0 and < 100 to match");

        do
        {
            if (!s.hasNextInt()) {s.next(); continue;}
            value = s.nextInt();
        }
        while (value > 100 || value < 0);
        System.out.println("The number was " + value);
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
        Scanner s = new Scanner( System.in );

        int currentMax = 0;
        int next;

        System.out.println( "Enter a series of numbers (any letter to quit)" );
        currentMax = s.nextInt();
        while( s.hasNextInt())
        {
            next = s.nextInt();
            if (next > currentMax)
            {
                currentMax = next;
            }
        }
        System.out.println("Max: " + currentMax);

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
        Scanner s = new Scanner( System.in );

        int currentMin = 0;
        int next;

        System.out.println( "Enter a series of numbers (any letter to quit)" );

        currentMin = s.nextInt();
        while( s.hasNextInt())
        {
            next = s.nextInt();
            if (next < currentMin)
            {
                currentMin = next;
            }
        }
        System.out.println("Min: " + currentMin);
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
        Scanner s = new Scanner( System.in );
        int currentNum = 0;
        int previousNum;

        System.out.print( "Enter a series of numbers (any letter to quit): " );
        if( s.hasNextInt() )
        {
            currentNum = s.nextInt();
        }
        while( s.hasNextInt() )
        {    
            previousNum = currentNum;
            currentNum = s.nextInt();
            if( previousNum == currentNum )
            {
                System.out.println("The previous two numbers matched, the program is now exiting.");
                break;
            }
        }
    }

}
