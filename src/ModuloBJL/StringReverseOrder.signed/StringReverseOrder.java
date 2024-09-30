/*******************************************************
 *                                                     * 
 * PROBLEM:                                            *
 *                                                     *
 * Complete the design of the function called          *
 * getStringInReverseOrder that consumes a String      *
 * and produces it in a reverse order.                 *
 *                                                     *
 * see examples wrapped in check-expect.               *
 *  -with the form: @check_expect (({in}) -> (out))    *
 *                                                     *
 * @author Henrique Rebelo                             *
 *******************************************************/
public class StringReverseOrder {
	
	/**
	 * Examples:
	 * @check_expect (({"Java"})        -> ("avaJ"))
	 * @check_expect (({"String"})      -> ("gnirtS"))
	 * @check_expect (({"12345678910"}) -> ("01987654321"))
	 */  
	public static String getStringInReverseOrder(String s) {
		  StringBuilder reversedStr = new StringBuilder(s);
        return reversedStr.reverse().toString();
	}
}
