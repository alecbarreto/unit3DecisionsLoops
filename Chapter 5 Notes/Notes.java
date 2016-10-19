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
    
    public static void printStudentClass( int gradeNumber )
    {
        /*
         * switch staement
         *      another conditional (like if statement)
         *      preferred when evaluating several discrete values
         *      flow of execution jumps to the branch matching the expression
         *      can be used for byte, short, char, int primitives types
         *      can be used for enumerations and the String class
         */
        switch( gradeNumber )
        {
            /*
             * can have multiple cases that share the same statements
             */
            case 6:
            case 7:
            case 8:
            {
                System.out.println( "Junior High" );
                
                /*
                 * break casuses the flow of execution to leave the switch
                 *  (without a break, the flow of execution continues into
                 *      the next case)
                 */
                break;
            }
            case 9:
            {
                System.out.println( "Freshmen" );
                break;
            }
            case 10:
            {
                System.out.println( "Sophomore" );
                break;
            }
            case 11:
            {
                System.out.println( "Junior" );
                break;
            }
            case 12:
            {
                System.out.println( "Senior" );
                break;
            }
            /*
             * default matches everything not matched by one of the cases
             */
            default:
            {
                System.out.println( "Elementary" );
                break;
            }
        }
    }
    
    /*
     * enumeration is a set of objects that represent a related set of choices
     *      usually compared with the equality operator (==)
     *      enumerations are capitalized like classes
     *      enumerated values are capitalized like constants
     */
    public enum FilingStatus { SINGLE, MARRIED, HEAD_OF_HOUSEHOLD };
    
    
    /*
     * Filing Status            Standard Deduction
     * single                   $6300
     * married filing jointly   $12600
     * head of household        $9250
     */
    public static double calculateStandardDeduction( FilingStatus status )
    {
        double deduction = 0;
        
        switch( status )
        {
            case SINGLE:
            {
                deduction = 6300;
                break;
            }
            case MARRIED:
            {
                deduction = 12600;
                break;
            }
            case HEAD_OF_HOUSEHOLD:
            {
                deduction = 9250;
                break;
            }
        }
        
        if( status == FilingStatus.MARRIED )
        {
            System.out.println( "must file jointly for this deduction" );
        }
        
        return deduction;
    }
    
    public static void incrementExample()
    {
        /*
         * post increment / decrement operators
         *      equivalent to adding or subtracting 1
         *      returns the current value and then increments or decrements
         */
        int b = 7;
        int a = b++;
        
        System.out.println( "a = " + a + "; b = " + b ); // a = 7; b = 8
        
        /*
         * pre increment / decrement operators
         *      equivalent to adding or subtracting 1
         *      returns the value after the increment or decrement
         */
        int c = 7;
        int d = ++c;
        
        System.out.println( "d = " + d + "; c = " + c ); // d = 8; c = 8
        
        /*
         * assignment operators: +=, -=, *=, /=, %=
         *      same as in Python
         *      performs the specfiied operation and then assigns the
         *          resulting value
         */
        int x = 7;
        int y = 7;
        int z = 7;
        
        x = x + 1;
        y++;
        z += 1;
        
        System.out.println( "x = " + x + "; y = " + y + "; z = " + z );
        
    }
    
    
}





