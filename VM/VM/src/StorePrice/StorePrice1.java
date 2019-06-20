/*
 * StorePrice1
 * Implementation of StorePrice
 * This class is designed to perform operation for Vending machine 1
 * This class have one method storePrice with argument as datastore object
 * 
 */
package StorePrice;

import DataStore.*;

public class StorePrice1 extends StorePrice {

	/*
	 * This method will get the temp_p value from datastore and assign it to price variable
	 */
	@Override
	public void storePrice(DataStore d) {
		d.setPrice(d.getTemp_p());
		System.out.println("Set Temp p to price");
		// sets temp_p to price
	}

}
