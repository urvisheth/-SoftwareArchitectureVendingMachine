/*
 * Increase CF
 * This is a meta action class for increase in the cumulative fund which is entered by user 
 * This is an abstract class having one method that will be implemented in child classes
 */
package IncreaseCF;

import DataStore.DataStore;

public abstract class IncreaseCF {
	public abstract void increaseCF(DataStore d); // this method will increase cf value in the data store object passed 
}
