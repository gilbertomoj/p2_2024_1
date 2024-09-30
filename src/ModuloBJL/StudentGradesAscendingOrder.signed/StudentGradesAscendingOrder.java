import java.util.*;

/*******************************************************
 *                                                     * 
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called          *
 * getGradesInAscendingOrder that consumes an array of *
 * grades and produces the grades in ascending order.  *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/
public class StudentGradesAscendingOrder {
	/**
	 * Examples:
	 * @check_expect (({new double[] {10}})                 -> (double[]{10}))
	 * @check_expect (({new double[] {10, 0}})              -> (double[]{0, 10}))
	 * @check_expect (({new double[] {10, 9, 8, 2}})        -> (double[]{2, 8, 9, 10}))
	 * @check_expect (({new double[] {5, 9, 1, 2, 3}})      -> (double[]{1, 2, 3, 5, 9}))
	 * @check_expect (({new double[] {10, 9, 10, 1, 2, 1}}) -> (double[]{1, 1, 2, 9, 10, 10}))
	 */  
	public static double [] getGradesInAscendingOrder(double [] grades) {
        double[] sortedGrades = Arrays.copyOf(grades, grades.length);
        Arrays.sort(sortedGrades);
        return sortedGrades;
	}
}
