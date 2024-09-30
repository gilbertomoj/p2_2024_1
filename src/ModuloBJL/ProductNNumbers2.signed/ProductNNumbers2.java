/*******************************************************
 *                                                     * 
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called product  *
 * that consumes n double numbers and produces the     *
 * product of those numbers.                           *
 *                                                     *
 * @required the Java "while" loop                     *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/
public class ProductNNumbers2 {
	
  /**
   * Examples:
   * @check_expect (({new double[] {5}})       -> (5.0))
   * @check_expect (({new double[] {5, 5}})    -> (25.0))
   * @check_expect (({new double[] {-5, 5}})   -> (-25.0))
   * @check_expect (({new double[] {-5, -5}})  -> (25.0))
   * @check_expect (({new double[] {3, 3, 0}}) -> (0.0))
   */  
  public static double product(double [] numbers) {
    double product = 1;
    int i = 0; // aux. index for the while loop
    
    while(i < numbers.length) {
       product *= numbers[i];
       i++;
    }
    return product;
  }
}
