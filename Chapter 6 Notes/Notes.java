import java.util.Scanner;

public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      evaluates a boolean condition
         *      if true, executes the body and then re-evaluates the condition
         *      if false, skips the body and continues
         */
        
        int count = 1 ;     // initialization
        
        while( count <= 5 )     // condition
        {
            System.out.println( count );    // body
            
            count += 1;     // change the condition variable
        }
        
        System.out.println( "done" );
    }
    
    public static void whileExample2()
    {
        /*
         * This is an infinite loop!
         * 
         *  A better approach would be:
         *  
         *  while( count < 50 )
         */
        
        int count = 1;      // initialization
        
        while( count != 50 )    // condition
        {
            System.out.println( count );    // body
            
            count += 2;     // update the condition variable
        }
        
        System.out.println( "done" );
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         *  three parts of the for loop statement:
         *      1. initialization - executed once
         *      2. boolean condition - tested at the start of each iteration
         *      3. update the condition variable - executed at the *end*
         *              of each iteration *before* testing the condition again
         */
        
        for( int count = 1;     // initialization
                count <= 5;     // boolean condition
                count += 1 )    // update the condition variable
        {
            System.out.println( count );    // body
        }
        
        System.out.println( "done" );
        
        /*
         * variables defined within the for statement are scoped to the
         *      for statement and its body
         */
        //System.out.println( "final value of count: " + count );
    }
    
    public static void forExample2()
    {
        int count = 1;      // initialization
        
        for(    ;
                count <= 5;     // boolean condition
                count += 1 )    // update the condition variable
        {
            System.out.println( count );    // body
        }
        
        System.out.println( "done" );
        System.out.println( "final value of count: " + count );
    }
    
    public static void offByOne()
    {
        /*
         * The classic off-by-one error is common with for loops executing
         *      one too many or one too few times.
         *  
         *  Carefully ask: should the initial value start at 0 or 1?
         *                 should the condition be < or <= ?
         *                 
         *  "Think! Don't compile and try at random!"
         */

        // we want to print five '*'
        for( int i = 0;
                i <= 5;
                i++ )
        {
            System.out.print( "*" );
        }
        
        System.out.println();
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop):
         *      1. executes the body of the loop
         *      2. evaluates the boolean codition
         *          if true, executes the body of the loop again
         *          if false, continues execution after the loop
         */
        
        int count = 1;                      // initialization
        
        do
        {
            System.out.println( count );    // body
            
            count += 1;                     // update the condition variable
        }
        while( count <= 5 );                // condition
    }
    
    public static void sum()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print( "enter a positive integer (-1 to quit): " );
            /*
             * Sentinel Value
             *      value (e.g., -1) used to terminate a loop
             *      it is often entered by a user
             */
            value = s.nextInt();
            
            sum += value;   // this is a bug! sum is 1 less than it shoudl be
        }
        while( value != -1 );
        
        System.out.println( "sum: " + sum );
    }
    
    public static void sum2()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value;
        
        do
        {
            System.out.print( "enter a positive integer (-1 to quit): " );
            value = s.nextInt();
            
            if( value == -1 )
            {
                /*
                 * break: exits the inner-most loop it is in
                 *  (similiar behavior as used in switch statement)
                 *  
                 *  "we are done with this loop, right now"
                 */
                break;
            }
            
            sum += value;
        }
        while( value != -1 );
        
        System.out.println( "sum: " + sum );
    }
    
    public static void sum3()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value = 0;
        
        do
        {
            System.out.print( "enter a positive integer (-1 to quit): " );
            
            if( s.hasNextInt() == false )
            {
                s.next();
                
                /*
                 * continue:
                 *      1. skips to the end of the inner-most loop it is in
                 *      2. re-evaluates the loop condition at that point
                 *      
                 *  "we are done with this iteration; go to the next one"
                 */
                continue;
            }
            
            value = s.nextInt();
            
            if( value == -1 )
            {
                break;
            }
            
            sum += value;
        }
        while( value != -1 );
        
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






