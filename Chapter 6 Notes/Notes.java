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
}







