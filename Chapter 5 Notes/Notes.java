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
    
    /*
     * switch statement
     *      another conditional decision statement (like if statement)
     *      preferred when evaluating several *discrete* values
     *      can be used for byte, short, char, and int primitives
     *      can be used for enumerations and the String class
     *      
     *  the conditional is evaluated, flow of execution jumps to the case
     *      that matches
     */
    public static String getStudentClass( int gradeNumber )
    {
        String studentClass = null;
        
        switch( gradeNumber )
        {
            case 9:
            {
                studentClass = "freshman";
                
                /*
                 * break causes the flow of execution to leave the swtich
                 *  (without a break, the flow of execution continues into
                 *      the next case)
                 */
                break;
            }
            case 10:
            {
                studentClass = "sophomore";
                break;
            }
            case 11:
            {
                studentClass = "junior";
                break;
            }
            case 12:
            {
                studentClass = "senior";
                break;
            }
            
            /*
             * by leaving out the break, multiple cases can run the
             *  same code
             */
            case 6:
            case 7:
            case 8:
            {
                studentClass = "junior high";
                break;
            }
            
            /*
             * default matches everything not matched by one of the cases
             */
            default:
            {
                studentClass = "elementary";
                break;
            }
        }
        
        return studentClass;
    }
    
    /*
     * enumeration is a set of objects that represent a related set of choices
     *      usually compared with the equality operator (==)
     *      enumerations are capitalized like classes
     *      enumerated values are capitalized like constants
     */
    public enum FilingStatus { SINGLE, MARRIED, HEAD_OF_HOUSEHOLD };
    
    /*
     * Single: $6300
     * Married (filing jointly): $12600
     * Head of Household: $9250
     */
    public static double calculateStandardDeduction( FilingStatus status )
    {
        double deduction = 0;
        
        if( status == FilingStatus.SINGLE )
        {
            deduction = 6300;
        }
        else if( status == FilingStatus.MARRIED )
        {
            deduction = 12600;
        }
        else
        {
            deduction = 9250;
        }
        
        return deduction;
    }
    
    public static void testDeduction()
    {
        System.out.println( "deduction = " +
                calculateStandardDeduction( FilingStatus.SINGLE ));
    }
    
    public static void incrementExample()
    {
        /*
         * post increment / decrement operator
         *  equivalent to adding or subtracting 1
         *  returns the value before performing the increment / decrement
         */
        int a = 7;
        int b = a++;
        
        System.out.println( "a = " + a + "; b = " + b ); // a = 8; b = 7
        
        /*
         * pre increment / decrement operator
         *  returns the value after the increment / decrement
         */
        int c = 7;
        int d = ++c;
        
        System.out.println( "c = " + c + "; d = " + d ); // c = 8; d = 8
        
        /*
         * assignment operators: +=, -=, *=, /=, %=
         *      same as in Python
         *      perform the specified operator and then assigns the
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









