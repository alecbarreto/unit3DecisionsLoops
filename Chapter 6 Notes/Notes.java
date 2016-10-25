import java.util.Scanner;

public class Notes
{
    public static void main( String[] args )
    {
        /*
         * while loop:
         *      evaluates a boolean condition (like if statement)
         *      if true, exectues the statements
         *      re-evaluates the boolean condition
         *      continues until the condition is false
         */
        final int LIMIT = 5;
        int count = 1;
        
        while( count <= LIMIT )
        {
            System.out.println( count );
            count += 1;
        }
        
        System.out.println( "Done" );
        
        /*
         * Common bug: Infinite Loop
         */
        count = 1;
        //while( count != 50 )
        while( count < 50 )
        {
            System.out.println( count );
            count += 2;
        }
        
        System.out.println( "Done" );
        
        /*
         * for loop:
         *  three parts:
         *      1. initialization - executed once
         *      2. condition - tested at the start of each iteration
         *      3. increment - executed at the end of each iteration,
         *                      before testing condition
         */
        for( int count2 = 1;
                count2 <= LIMIT;
                count2++ )
        {
            System.out.println( count2 );
        }
        
        System.out.println( "done" );
        
        /*
         * commong bug #2: off-by-one error
         * 
         *  does the initial value start at 0 or 1?
         *  should the condition be < or <= ?
         *  
         *  "Think, don't compile and try at random!"
         */
        for( int i = 0;
            i <= 10;    // this should be i < 10
            i++ )
        {
            System.out.println( i );
        }
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop):
         *      1. executes the body of the loop
         *      2. evaluates the boolean condition (like an if statement)
         *          * if true, executes the body of the loop again
         *          * if fase, continues after the loop
         */
        int count = 1;  // initialization
        
        do
        {
            System.out.println( count ); // body
            
            count +=1 ;     // update condition variable
        }
        while( count <= 5 );    // condition
    }
    
    public static void sentinelExample()
    {
        /*
         * Sentinel Values
         *      values used to terminate a while/do loop
         *      often these values are entered by the user
         */
        
        int sum = 0;
        int value;
        Scanner s = new Scanner( System.in );
        
        do
        {
            // 0 is the sentinel value
            System.out.print( "enter an integer (0 to quit): " );
            value = s.nextInt();
            sum += value;
        }
        while( value != 0 );
        
        System.out.println( "sum: " + sum );
    }
    
    public static void sentinelExample2()
    {
        int sum = 0;
        int value;
        Scanner s = new Scanner( System.in );
        
        while( true )
        {
            // -1 is the sentinel value
            System.out.print( "enter an integer (-1 to quit): " );
            value = s.nextInt();
            
            if( value == -1 )
            {
                /*
                 * exit the inner-most loop
                 *  (similar behavior as used in switch statement)
                 *  
                 *  "done with this loop"
                 */
                break;
            }
            
            sum += value;
        }
        
        System.out.println( "sum: " + sum );
    }


    public static void sentinelExample3()
    {
        int sum = 0;
        int value = 0;
        Scanner s = new Scanner( System.in );
        
        while( value != -1 )
        {
            // -1 is the sentinel value
            System.out.print( "enter an integer (-1 to quit): " );
            value = s.nextInt();
            
            if( value == -1 )
            {
                /*
                 *  1. skips to the end of the inner-most loop
                 *  2. re-evaluates the loop condition at that point
                 *  
                 *  "done with this iteration"
                 */
                continue;
            }
            
            sum += value;
        }
        
        System.out.println( "sum: " + sum );
    }
    
    /*
     * Loop Algorithm #1: Sum and Average
     * reads a series of numbers
     * calculates the sum and average of the numbers
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
}







