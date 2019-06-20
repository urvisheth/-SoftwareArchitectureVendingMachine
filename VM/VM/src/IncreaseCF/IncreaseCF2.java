/*
 * Increase CF2
 * This is a meta action class for increase in the cumulative fund which is entered by user for Vending Machine 2
 * This class have implementation of the parent abstract class having one method
 */
package IncreaseCF;

import DataStore.DataStore;

public class IncreaseCF2 extends IncreaseCF{

	/*
	 * This method will increase the cf variable in Data store 2 by value of temp_v stored in ds 2
	 * The object passed as argument for the method will be having pointer to the object of data store d2
	 *  
	 */
	@Override
	public void increaseCF(DataStore d) {
		float v = d.getfloatTemp_v();
		float cf =  d.getfloatCf();
		d.setCf((cf + v));
		// increase Cumulative Fund cf by v value
	}

}
