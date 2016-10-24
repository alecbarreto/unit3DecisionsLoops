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
    
    
}






