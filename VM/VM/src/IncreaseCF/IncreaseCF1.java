/*
 * Increase CF1
 * This is a meta action class for increase in the cumulative fund which is entered by user for Vending Machine 1
 * This class have implementation of the parent abstract class having one method
 */
package IncreaseCF;

import DataStore.DataStore;

public class IncreaseCF1 extends IncreaseCF {
	
	/*
	 * This method will increase the cf variable in Data store 1 by value of temp_v stored in ds 1
	 * The object passed as argument for the method will be having pointer to the object of data store d1
	 *  
	 */

	@Override
	public void increaseCF(DataStore d) {
		// TODO Auto-generated method stub
		int v = d.getTemp_v();
		int cf =  d.getCf();
		d.setCf((cf + v));
		// increase Cumulative Fund cf by v value
	}

}
