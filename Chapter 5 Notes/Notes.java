import java.util.Scanner;

public class Notes
{
    public static void main( String[] args )
    {
        /*
         * Math.random returns a double between 0.0 (inclusive) and
         *      1.0 (exclusive)
         *      
         *      To generate a random integer between 0 (inclusvie) and 
         *          x (exclusive), multiply by x and cast to an int.
         *      For example:    
         *          (int)(Math.random() * x);
         */
        
        // 1: heads; 0: tails
        int coin = (int)(Math.random() * 2);
        
        /*
         * if statement:
         *      conditional expression goes inside parantheses
         *      statements are grouped by blocks (e.g., {}) not indentation
         *      no colon (unlike Python)
         *      
         */
        if( coin == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        
        /*
         * { } are not required for a single statement, but good idea
         *      leaving them out can lead to bugs like this
         */
        if( coin == 0 )
            System.out.println( "Coin is tails!" );
            System.out.println( "Better luck next time..." );
            
        /*
         * if-else statement:
         *      else block is executed if the conditional for the if
         *          statement is false
         */
        if( coin == 1 )
        {
            System.out.println( "Coin is heads!" );
        }
        else
        {
            System.out.println( "Coin is tails!" );
            System.out.println( "Better luck next time..." );
        }
        
        // simulate the roll of a six-sided die (values 1-6)
        int dieRoll = (int)(Math.random() * 6) + 1;
        
        /*
         * if-else if-else statement
         *      else if is used instead of elif
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
            System.out.println( "rolled a 4, 5, or 6" );
        }
        
        /*
         * When comparing Strings (or any object), the equality operator (==)
         *      returns true if the two variables reference the same object
         *      (i.e., same memory location, pointer)
         *  
         *  If that isn't what we want (and it probably isn't), we need
         *      to use the equals method on the object.
         */
        Scanner s = new Scanner(System.in);
        System.out.print( "enter two strings: " );
        String str1 = s.next();
        String str2 = s.next();
        
        // this checks if the references are equal; not the set of characters
        if( str1 == str2 )
        {
            System.out.println( "string references are equal!" );
        }
        else
        {
            System.out.println( "string references are not equal!" );
        }
        
        // this checks if the strings have the same set of characters
        if( str1.equals( str2 ))
        {
            System.out.println( "strings are equal!" );
        }
        else
        {
            System.out.println( "strings are not equal!" );
        }
        
        /*
         * Determine which string comes first lexographically
         *      (kind of like alphabetically; check notes) using
         *      the compareTo method of the String class.
         *      
         *  compareTo returns
         *      0: if the strings contain the same characters
         *      < 0: if str1 < str2 lexographically
         *      > 0: if str1 > str2 lexographically
         */
        int result = str1.compareTo( str2 );
        String firstStr = null;
        
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
            /*
             * if we attempt to invoke a method on a variable whose value is
             *      null, that generates a null pointer exception.
             *  Avoid this by checking if a variable is null first!
             */
            System.out.println( "Its length is: " + firstStr.length());
        }
        else
        {
            System.out.println( "The strings are equal." );
        }
        
    }
    
    public static boolean floatsAreEqual( double num1, double num2 )
    {
        /*
         * if we use the equality operator (e.g., ==) for doubles, it
         *      will only return true if all binary digits match
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
        // return (Math.abs( num1 - num2 ) < EPSILON );
    }
    
}





