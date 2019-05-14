/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib_recurrence(n - 1) + fib_recurrence(n - 2);
    }
     /* These are class / instance methods because their computations do not depend on any
        instances variables but soley on their parameters.
    */

    /* Time complexity:
       Consider the size of the problem to be the number of function calls required per input
       
       As the proxy for the time required, count number of function calls
       
       Then cost of the the recurrence algorithm
       grows exponentially
       as the size of the problem increases,
       because each increase of n means repeating the # of function calls
       required for n twice, along with an additional iteration, meaning each increase 
       causes the number of function callsto grow at a rate similar to the fibonacci sequenxe iselt.

       Highest n which requires at most only a few seconds: about 42
    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int last = 0;
        int secondLast = 1;
        
        for(;n > 0; n--) {
          int oldLast = last;
          last = last + secondLast;
          secondLast = oldLast;
        }
        return last;
    }
    /* Time complexity:
       Consider the size of the problem to be the number of iterations
       
       As the proxy for the time required, count...
       
       Then cost of the the grade8 algorithm
       grows linearly
       as the size of the problem increases,
       because a new pair of last and secondLast must be found for every n
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = 1 + sqrt5;

        return (Math.pow(phi, n) - Math.pow(-phi, -n)) / (Math.pow(2, n) * sqrt5);

    }
    /* Time complexity:
       Consider the size of the problem to be the number of operations required per input
       
       As the proxy for the time required, count number of function calls, and complexity of each call
       
       Then cost of the the Binet algorithm
       remains constant
       as the size of the problem increases,
       becauseeach operation can be assumed to be constant, and the number of operations performed remains constant.
     */

}
