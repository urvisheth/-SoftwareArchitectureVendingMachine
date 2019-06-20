/*
 * ReturnCoins1
 * Implementation of ReturnCoins
 * This class is designed to perform operation for Vending machine 1
 * This class have one method return coins with argument as datastore object
 * This method will simply return the coins and here as we don't have any variable 
 * associated with coin entered, I am simply printing the message
 */
package ReturnCoins;

import DataStore.DataStore;

public class ReturnCoins1 extends ReturnCoins{

	@Override
	public void returnCoins(DataStore d) {
		// This method Returns coins inserted
		System.out.println("Coins Returned");
	}

}
