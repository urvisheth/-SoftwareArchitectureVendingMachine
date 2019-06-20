/*
 * ZeroCF1
 * Implementation of ZeroCF
 * This class is designed to perform operation for Vending machine 1
 * This class have one method return coins with argument as datastore object
 * This method will simply set the cumulative fund value to 0
 */
package ZeroCF;

import DataStore.DataStore;

public class ZeroCF1 extends ZeroCF {
	
	// this method sets Cumulative Funds to integer 0
	@Override
	public void zeroCF(DataStore d) {
		int s = 0;
		d.setCf(s);
		System.out.println("Set Cumulative Funds to 0");
	}
}
