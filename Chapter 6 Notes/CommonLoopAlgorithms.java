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
     * RED GROUP
     */
    public static void countMatches()
    {
        Scanner s = new Scanner( System.in );
        int count = 0;
        int value = 0;
        System.out.println( "Enter value: ");
        while (s.hasNextInt())
        {
            value = s.nextInt();
            if (value > 100)
            {
                count +=1;
            }
        }
        System.out.println( "Count: " + count );
    }   

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * prints the number of words read before the match
     * 
     * ORANGE GROUP
     */
    public static void findFirstMatch() {
        Scanner s = new Scanner( System.in );
        String inp;
        System.out.println("Please Enter Stuff: ");
        inp = s.nextLine();
        int whitespace = 0;
        int pwhitespace = 0;
        int count = 0;
        for(int i = 0; i<inp.length(); i++) {
            String test = inp.substring(i, i+1);
            if (test.compareTo(" ") == 0) {
                pwhitespace = whitespace;
                whitespace = i;
                count++;
            }
            if (whitespace-pwhitespace > 5) {
                break;
            }
        }
        System.out.println("We read "+count+" words.");

    }

    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * prints the number that matched the criteria
     * 
     * BLUE GROUP
     */
    public static void promptUntilMatch()
    {
        Scanner s = new Scanner( System.in );
        int num = 101;

        do
        {
            System.out.println("Enter an Integer");
            num = s.nextInt();
        } 
        while( num > 100 || num < -1 );
        System.out.println("You entered a value that matched the criteria");
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
        Scanner s = new Scanner( System.in );
        double num;

        System.out.println( "Enter a series of numbers (any letter to quit)" );

        if (s.hasNextDouble()) {
            num = s.nextDouble();

            while( s.hasNextDouble())
            {
                double value = s.nextDouble();
                if (value > num) {
                    num = value;
                }
            } 

            System.out.println(num + " is the largest number.");
        } else {
            System.out.println("You didn't enter a number. How dare you.");
        }
    }

    /*
     * Loop Algorithm #5.2: findMin
     * reads a series of numbers (ends with a letter)
     * prints the least number
     * 
     * PURPLE GROUP
     */
    public static void findMin()
    {
        Scanner s = new Scanner( System.in );
        double num;

        System.out.println( "Enter a series of numbers (any letter to quit)" );

        if (s.hasNextDouble()) {
            num = s.nextDouble();

            while( s.hasNextDouble())
            {
                double value = s.nextDouble();
                if (value < num) {
                    num = value;
                }
            } 

            System.out.println(num + " is the smallest number.");
        } else {
            System.out.println("You didn't enter a number. How dare you.");
        }
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers (ends with a letter)
     * prints a message if an adjacent duplicate number is entered and exits the loop
     * 
     * GREEN GROUP
     */
    public static void compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        boolean isAdjacent = false;
        int old = -1;
        int current = 0;
        boolean isFirst = true; 
        System.out.print("Enter a number (letter to quit): ");
        while(s.hasNextInt()) {

            System.out.print("Enter a number (letter to quit): "); 
            current = s.nextInt();
            if(!isAdjacent && old == current &&!isFirst) {
                isAdjacent = true;
            }
            old = current;
            isFirst = false;
        }
        if(isAdjacent) {
            System.out.println("Adjacent!");
        } else {
            System.out.println("Not Adjacent!");
        }
    }
}