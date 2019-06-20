/*
 * StorePrice
 * This is a meta action class for storing price for a beverage which is entered 
 * This is an abstract class having one method that will be implemented in child classes
 */
package StorePrice;

import DataStore.DataStore;

public abstract class StorePrice {

	public abstract void storePrice(DataStore d);	//this is an abstract method, implemented in child having datastore as argument
}
