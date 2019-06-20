/*
 * ZeroCF
 * Abstract Class represents meta action Zero CF
 * This class is abstract class and the classes implementing this class will
 * be having definition of the class
 * This class have one method to perform the action that will take a datastore object as an argument
 * 
 */
package ZeroCF;

import DataStore.DataStore;

public abstract class ZeroCF {
	public abstract void zeroCF(DataStore d);	//this is an abstract method, implemented in child having datastore as argument

}
