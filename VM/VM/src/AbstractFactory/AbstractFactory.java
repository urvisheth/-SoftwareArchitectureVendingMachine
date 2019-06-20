/*
 * This class is an abstract factory class that will help to generate 
 * required objects for different types of vending machine
 * All methods here are abstract
 * This class is connected to VM-1, VM-2 and OP
 * the child classes of this class are connected to Data Store child class as well
 */

package AbstractFactory;

import DisposeAdditive.DisposeAdditive;
import DisposeDrink.DisposeDrink;
import IncreaseCF.IncreaseCF;
import ReturnCoins.ReturnCoins;
import StorePrice.StorePrice;
import ZeroCF.ZeroCF;

public abstract class AbstractFactory {
	
	public abstract StorePrice makeObjectStorePrice();
	public abstract ZeroCF makeObjectZeroCF();
	public abstract IncreaseCF makeObjectIncreaseCF();
	public abstract ReturnCoins makeObjectReturnCoins();
	public abstract DisposeDrink makeObjectDisposeDrink();
	public abstract DisposeAdditive makeObjectDisposeAdditive();

}

