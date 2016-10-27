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
     * BLUE GROUP
     */
    public static void countMatches()
    {
        Scanner s = new Scanner( System.in );
        double number = 0;
        int count = 0;

        System.out.println( "Enter a series of numbers (any letter to quit)" );
        while(s.hasNextDouble())
        {

            number = s.nextDouble();

            if (number > 100)
            {
                count ++;
            }
            System.out.println( "Enter a series of numbers (any letter to quit)" );
        }

        System.out.println( "The number of numbers that are greater than 100:"+ count );
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * prints the number of words read before the match
     * 
     * GREEN GROUP
     */
    public static void findFirstMatch()
    {
        System.out.print("Please enter a series of words separated by whitespace: ");
        Scanner s = new Scanner(System.in);
        String series = s.next();
        int count = 0;
        while (series.length()<6)
        {
            series = s.next();
            count+=1;
        }
        System.out.println("Count: "+count);
    }

    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * prints the number that matched the criteria
     * 
     * RED GROUP
     */
    public static void promptUntilMatch()
    {
        Scanner s = new Scanner( System.in );
        double userNum = 101.0;

        while (userNum >= 100) 
        {
            System.out.println( "Enter a number(intergers only): " );
            userNum = s.nextDouble();

            if ((userNum <= -1) || ((userNum%1)>0))
            {
                userNum = 101;
            }
        }

        System.out.println( (int)userNum );
    }

    /*
     * Loop Algorithm #5.1: findMax
     * reads a series of numbers (ends with a letter)
     * prints the greatest number
     * 
     * PURPLE GROUP
     */
    public static void findMax() 
    {
        Scanner sc = new Scanner(System.in);
        int greatest = 0;
        do {
            System.out.println("Please enter an integer: ");
            int find = sc.nextInt();
            if (find > greatest) {
                greatest = find;
            }
        }
        while (sc.hasNextInt() == true);
        System.out.println("The greatest integer is " + greatest);
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * prints the least number
     * 
     * YELLOW GROUP
     */
    public static void findMin()
    {
        Scanner s = new Scanner( System.in );
        System.out.print("Enter a positive integer: ");
        int val = s.nextInt();
        int min = val;

        do 
        {
            System.out.print("Enter a positive integer: ");

            if(!(s.hasNextInt()))
            {
                break;
            }
            val = s.nextInt();
            if (val<min)
            {
                min = val;
            }

        }

        while(val != 0);

        System.out.print("Min: " + min);
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * prints a message if an adjacent duplicate number is entered and exits the loop
     * 
     * ORANGE GROUP
     */
    public static void compareAdjacent()
    {
        int old;
        int new1;

        Scanner s = new Scanner( System.in );
        System.out.print("Enter a number: ");
        new1 = s.nextInt();
        do {
            old = new1;
            System.out.print("Enter a number: ");
            if(s.hasNextInt()==false)
            {

            }
        }while (new1 !=1);

    }

}
