/*
 * OP class
 * Represents the output processor
 * This class contains meta action to be performed for the execution of system operations
 * Each meta action is having it's individual class as per "Abstract Factory Pattern"
 * This class will call the corresponding meta action class for particular action
 * This class in connected to state class, data store class and other meta action classes
 * 
 */
package OP;

import DataStore.*;
import StorePrice.*;
import ZeroCF.*;
import IncreaseCF.*;
import ReturnCoins.*;
import DisposeDrink.*;
import AbstractFactory.*;
import DisposeAdditive.*;

public class OP {

	// This class have 7 data variables, 6 for each meta action and one for data store 
	 DataStore datastore;
	 StorePrice storeprice;
	 ZeroCF zerocf;
	 IncreaseCF increasecf;
	 ReturnCoins returncoin;
	 DisposeDrink disposedrink;
	 DisposeAdditive disposeadditive;

	 // to call storePrice method of StorePrice class with datastore object as argument
	public void StorePrice() {
		storeprice.storePrice(datastore);
	}
	
	//to call zeroCF method of ZeroCF class with datastore object as argument
	public void ZeroCF() {
		zerocf.zeroCF(datastore);	
	}
	
	// to call increaseCF method of IncreaseCF class with datastore object as argument
	public void IncreaseCF() {
		increasecf.increaseCF(datastore);
		
	}
	
	// to call returnCoins method of ReturnCoins class with datastore object as argument
	public void ReturnCoins() {
		returncoin.returnCoins(datastore);
	}
	
	// to call disposeDrink method of DisposeDrink class with type of drink as integer argument
	public void DisposeDrink(int d) {
		disposedrink.disposeDrink(d);
	}
	
	//  to call disposeAdditive method of DisposeAdditive class with Array of Additive type selected value as integer array argument
	public void DisposeAdditive(int A[]) {
		disposeadditive.disposeAdditive(A);
	}
	
	/*
	 * This class is called from Vending machine classes -> and then MDA-EFSM , 
	 * to get different meta actions Output Class objects to perform operations
	 * this have two arguments of abstract factory and data store that can define which 
	 * version of meta action and data store child classes to be used, either version 1 or 2
	 * according to that classes are initialized in abstract factory
	 * 
	 */
	public void intialize(AbstractFactory abstractfactory, DataStore d) {
		storeprice = abstractfactory.makeObjectStorePrice();
		zerocf = abstractfactory.makeObjectZeroCF();
		increasecf = abstractfactory.makeObjectIncreaseCF();
		returncoin =  abstractfactory.makeObjectReturnCoins();
		disposedrink = abstractfactory.makeObjectDisposeDrink();
		disposeadditive = abstractfactory.makeObjectDisposeAdditive();
		datastore = d;
	}

}
