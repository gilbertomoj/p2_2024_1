/*******************************************************
 *                                                     * 
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called sum      *
 * that consumes a natural number and produces the     *
 * sum of [all] natural numbers starting from 1 to     *
 * the consumed x.                                     *
 * That is:  1 + 2 + 3 + ... + x                       *
 *                                                     *
 * @required the Java "while" loop                     *                               
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/
public class SumNatural {
	
  /**
   * Examples:
   * @check_expect (({0})   -> (0))
   * @check_expect (({1})   -> (1))
   * @check_expect (({10})  -> (55))
   * @check_expect (({-10}) -> (0))
   * @check_expect (({100})  -> (5050))
   */  
  public static int sum(int x) {
    int sum = 0;
    int count = 1; // first number to start sum
        while(count <= x) {
            sum += count;
            count++;
        }
    return sum;
  }
}
