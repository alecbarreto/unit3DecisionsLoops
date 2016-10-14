import java.util.Scanner;

public class Notes
{
    public static void main( String[] args )
    {
        /*
         * Math.random() returns a double between 0.0 (inclusive) and
         *      1.0 (exclusive)
         *      
         *      To generate a random integer between 0 (inclusive) and
         *          x (exclusive), multiply by x and cast to an int:
         *          
         *          (int)(Math.random() * x);
         */
        
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);
        
        /*
         * if statement
         *      statements are executed if the conditional expression is true
         *      conditional expression must go inside of parentheses
         *      statements are grouped by blocks (i.e., { } )
         *          not by indentation like in Python
         *      no colon after the conditional expression (unlike Python)    
         */
        if( coinFlip == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        
        /*
         * { } are not required for a single statement
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        if( coinFlip == 0 )
            System.out.println( "Coin is tails." );
            System.out.println( "Better luck next time..." );
            
        /*
         * if-else statement
         *      else block is executed if the conditional for the if
         *          statement is false
         */
        if( coinFlip == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        else
        {
            System.out.println( "Coin is tails." );
            System.out.println( "Better luck next time..." );
        }
        
        // simulate the roll of a four-sided die (1-4)
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if-else if-else statement
         *      in Java, "else if" is used instead of elif like Python
         */
        if( dieRoll == 1 )
        {
            System.out.println( "rolled a 1" );
        }
        else if( dieRoll == 2 )
        {
            System.out.println( "rolled a 2" );
        }
        else if( dieRoll == 3 )
        {
            System.out.println( "rolled a 3" );
        }
        else
        {
            System.out.println( "rolled a 4" );
        }
    }
    
    public static boolean floatsAreEqual( double num1, double num2 )
    {
        /*
         * If we use the equality operator (==) for double, its
         *      will only return true if all binary digits match.
         *  This is probably not the case and not what we want.
         *  We will check if they are "close enough" (i.e., epsilon value)
         */
        final double EPSILON = 1e-14;
        
        if( Math.abs( num1 - num2 ) < EPSILON )
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use an if statement
        //return ( Math.abs( num1 - num2 ) < EPSILON );
    }
    
    public static void stringExamples()
    {
        Scanner s = new Scanner( System.in );
        System.out.print( "Enter two strings: " );
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two variables
         *      (e.g., str1 and str2) contain the same value. For objects,
         *      including Strings, this means they contain the same reference.
         *      That is, they refer to the same object in memory, not that
         *      two Strings have the same sequence of characters.
         */
        if( str1 == str2 )
        {
            System.out.println( "string references are equal." );
        }
        else
        {
            System.out.println( "string references are not equal." );
        }
        
        /*
         * The equals method returns true if the two objects are equal.
         *      What equals means is defined by that class. For Strings
         *      it means that the two objects have the same sequence of
         *      characters.
         */
        if( str1.equals( str2 ))
        {
            System.out.println( "strings are equal" );
        }
        else
        {
            System.out.println( "strings are not equal" );
        }
        
        /*
         * We will determine which string comes first lexographically
         *  using the compareTo method of the String class.
         *  
         *  compareTo returns
         *      0:   if the strings are equal (same sequence of characters)
         *      < 0: if str1 < str2 lexographically
         *      > 0: if str1 > str2 lexographically
         */
        int result = str1.compareTo( str2 );
        String firstStr = null; //assigning the null reference to firstStr
        
        if( result < 0 )
        {
            firstStr = str1;
        }
        else if( result > 0 )
        {
            firstStr = str2;
        }
        
        if( firstStr != null )
        {
            System.out.println( "The first string is: " + firstStr );
            System.out.println( "Its length is: " + firstStr.length());
        }
        else
        {
            System.out.println( "Strings are equal." );
        }
    }
}






