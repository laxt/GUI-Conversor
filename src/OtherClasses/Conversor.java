/***
* Conversor - Handles conversion between degrees and radians
* @author: Laxmana Thapa
* @version: 1.0
**/

package OtherClasses;

public class Conversor {

	/**
	 * Converts provided value to degrees
	 * @param radians Value to convert
	 * @return Value converted to degrees
	 */
	public double toDegrees(double radians){
		return Math.toDegrees(radians);
	}
	
	/**
	 * Converts given value to radians
	 * * @param degrees Value to convert
	 * @return Value converted to radians
	 */
	public double toRadians(double degrees){
		return Math.toRadians(degrees);	
	}

}
