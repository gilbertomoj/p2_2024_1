/********************************************************
 *                                                      * 
 * PROBLEM:                                             *
 *                                                      *
 * Complete the design of the function called           *
 * averagerainfall that consumes an array of double     *
 * and produces the average, but ignore negative values *
 * (which must have been measurement errors), and stop  *
 * when you reach the sentinel 9999.                    *
 *                                                      *
 * see examples wrapped in check-expect.                *
 *  -with the form: @check_expect (({in}) -> (out))     *
 *                                                      *
 * @author Henrique Rebelo                              *
 ********************************************************/
public class Rainfall {
  /**
	 * Examples:
	 * @check_expect (({new double[] {1, 2, 3, 4, 5, 9999}})       -> (3.0))
	 * @check_expect (({new double[] {1, 2, -3, 4, 5, 9999}})      -> (3.0))
	 * @check_expect (({new double[] {1, 2, 3, 4, 5, 9999, 6, 7}}) -> (3.0))
	 * @check_expect (({new double[] {1, 2, 3, -4, 9999, 5}})      -> (2.0))
	 * @check_expect (({new double[] {10, 9999}})                  -> (10.0))
	 * @check_expect (({new double[] {10, 0, 9999}})               -> (5.0))
	 * @check_expect (({new double[] {-1, -2, -3, 9999}})          -> (0.0))
	 * @check_expect (({new double[] {9999}})                      -> (0.0))
	 */  
   public static double averageRainfall(double[] rainfall) {
      double sum = 0;
      int i = 0;
      int count = 0;
      // YOUR CODE HERE!
              for(i = 0; i < rainfall.length; i++) {
            if(rainfall[i] == 9999.0) {
                break;
            }
            if(rainfall[i] > 0) {
                sum += rainfall[i];
                count += 1;
            }
        }
      if(count == 0) {
         return 0.0;
      }
      return sum / count; 
  }
}
