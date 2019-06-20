/*
 * ReturnCoins
 * Abstract Class represents meta action Return Coin
 * This class is abstract class and the classes implementing this class will
 * be having definition of the class
 * This class have one method to perform the action that will take a datastore object as an argument
 * 
 */
package ReturnCoins;

import DataStore.DataStore;

public abstract class ReturnCoins {
	
	public abstract void returnCoins(DataStore d);

}
