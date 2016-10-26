import java.util.Scanner;

public class Notes
{
    public static void whileExample()
    {
        /*
         * while loop:
         *      evaluates a boolean condition (like an if statement)
         *      if true, executes the body of the loop and then
         *          re-evaluates the boolean condition
         *      if false, skips the body of the loop and continues
         */
        
        int count = 1; // initialization
        
        while( count <= 5 ) // condition
        {
            System.out.println( count ); // body
            count += 1 ; // change the condition variable
        }
        
        System.out.println( "done" );
        
    }
    
    public static void infiniteLoop()
    {
        int count = 1;
        
        /*
         * This is an infinite loop. It would be better to write as:
         *  while( count < 50 )
         */
        while( count != 50 )
        {
            System.out.println( count );
            count += 2;
        }
        
        System.out.println( "done" );
    }
    
    public static void forExample()
    {
        /*
         * for loop:
         *   three parts of the for loop statement:
         *      1. initialization - executed once
         *      2. boolean condition - tested at the start of each iteration
         *      3. change of condition variable - executed at the *end*
         *              of each iteration *before* again testing the condition
         */
        
        for( int count = 1;     // initialization
                count <= 5;     // condition
                count += 1 )    // change the conditional variable
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
        /*
         * if count needs to be scoped beyond the for statement,
         *      initialize count before the for statement
         */
        int count = 1; // initialization
        for(    ;     // no statement required
                count <= 5;     // condition
                count += 1 )    // change the conditional variable
        {
            System.out.println( count );    // body
        }
        
        System.out.println( "done" );
        System.out.println( "final value of count: " + count );
    }
    
    public static void offByOne()
    {
        /*
         * The class off-by-one is common with for loops executing once
         *      too many or once too few times
         *      
         *  Carefully ask: should the initial value start at 0 or 1?
         *      should the condition be < or <= ?
         *  
         *  "Think! Don't compile and try at random!"
         */
        
        // We want to print five '*'
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
         *      2. evaluates the boolean condition
         *          if true, executes the body of the loop again
         *          if false, continues execution after the loop
         */
        
        int count = 1;                          // initialization
        
        do
        {
            System.out.println( count );        // body
            
            count += 1;                         // update the condition variable
        }
        while( count <= 5 );                    // condition
    }
    
    public static void sum()
    {
        Scanner s = new Scanner( System.in );
        
        int sum = 0;
        int value;
        
        do
        {
            /*
             * Sentinel Value
             *      value (e.g., 0) used to terminate a loop
             *      it is often entered by a user
             */
            System.out.print( "enter an integer (-1 to quit): " );
            value = s.nextInt();
            
            sum += value;
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
            System.out.print( "enter an integer (-1 to quit): " );
            value = s.nextInt();
            
            if( value == -1 )
            {
                /*
                 * break: exits the inner-most loop it is in
                 *  (similar behavior as used in switch statement)
                 *  
                 *  "we are done with this loop"
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
            System.out.print( "enter an integer (-1 to quit): " );
            
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
    
}






