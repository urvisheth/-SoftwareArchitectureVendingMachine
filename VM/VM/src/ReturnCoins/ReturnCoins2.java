/*
 * ReturnCoins2
 * Implementation of ReturnCoins
 * This class is designed to perform operation for Vending machine 2
 * This class have one method return coins with argument as datastore object
 * This method will simply return the coins and here as we don't have any variable 
 * associated with coin entered, I am simply printing the message
 */
package ReturnCoins;

import DataStore.*;

public class ReturnCoins2 extends ReturnCoins {

	@Override
	public void returnCoins(DataStore d) {
		// Returns coins inserted
		System.out.println("Coins Returned");

	}

}
