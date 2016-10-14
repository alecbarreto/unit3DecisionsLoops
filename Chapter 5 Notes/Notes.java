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
         *          x (exclusive), multiple by x and cast to an int.
         *      For example:
         *          (int)(Math.random() * x);
         */
        
        // model a coin; 1: heads; 0: tails
        int coin = (int)(Math.random() * 2);
        
        /*
         * if statement
         *      conditional expression goes inside parentheses
         *      statements associated with the if are grouped by blocks
         *          (i.e., { } ), not indentation like Python
         *      no colon after the conditional like Python
         */
        if( coin == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        
        /*
         * { } are not required for a single statement, but they are always
         *      a good idea. Leaving them out can lead to bugs like this:
         */
        if( coin == 0 )
            System.out.println( "Coin is tails." );
            System.out.println( "Better luck next time..." );
        
        /*
         * if-else statement
         *      else block is executed if the conditional for the if
         *          statement is false
         */
        if( coin == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        else
        {
            System.out.println( "Coin is tails." );
            System.out.println( "Better luck next time..." );
        }
        
        // simulate the roll of a four-sided die (values 1-4)
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if-else if-else statement
         *      in Java, else if is used instead of elif like Python
         */
        if( dieRoll == 1 )
        {
            System.out.println( "rolled a 1" );
        }
        else if( dieRoll == 2 )
        {
            System.out.println( "rolled a 2" );
        }
        else if( dieRoll == 3)
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
         * If we use the equality operator ( == ) for doubles, it
         *      will only return true if all binary digits match.
         *  This probably is not the case and not what we want.
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
        //return ( Math.abs( num1 - num2) < EPSILON );
    }
    
    public static void stringExamples()
    {
        Scanner s = new Scanner( System.in );
        System.out.print( "enter two strings: " );
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two variables
         *      (e.g., str1 and str2) contain the same value. For objects,
         *      including Strings, this means they contain the same refernce.
         *      That is, they refer to the same object in memory. Not that
         *      two Strings have the same sequence of characters.
         */
        if( str1 == str2 )
        {
            System.out.println( "string refernces are equal" );
        }
        else
        {
            System.out.println( "string references are not equal" );
        }
        
        /*
         * The equals method returns true if two objects are equal.
         *      What equals means is defined by that class. For Strings,
         *      it means the two objects have the same sequence of characters.
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
         *      (i.e, kind of alphabetically, check notes) using the
         *      compareTo method of the String class.
         *      
         *  compareTo returns
         *      0:   if the strings are equal (same sequence of characters)
         *      < 0: if str1 < str2 lexographically
         *      > 0: if str1 > str2 lexographically
         */
        int result = str1.compareTo( str2 );
        String firstStr = null; // assigning the null reference to firstStr
        
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
            System.out.println( "The strings are equal." );
        }
        
    }
}









