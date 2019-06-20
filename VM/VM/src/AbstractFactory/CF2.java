/*
 * CF2
 * Concrete Factory 2
 * Child of Abstract Factory
 * This will create required Output Class objects to use Vending Machine 2
 * 
 */
package AbstractFactory;

import DisposeAdditive.*;
import DisposeDrink.*;
import IncreaseCF.*;
import ReturnCoins.*;
import StorePrice.*;
import ZeroCF.*;

public class CF2 extends AbstractFactory{

	@Override
	public StorePrice makeObjectStorePrice() {
		// Get object of store price class 2 for vending machine 2
		return new StorePrice2();
	}

	@Override
	public ZeroCF makeObjectZeroCF() {
		// Get object of zero cumulative factor price class 2 for vending machine 2
		return new ZeroCF2();
	}

	@Override
	public IncreaseCF makeObjectIncreaseCF() {
		// Get object of increase cumulative factor price class 2 for vending machine 2
		return new IncreaseCF2();
	}

	@Override
	public ReturnCoins makeObjectReturnCoins() {
		// Get object of return coins 2 for vending machine 2
		return new ReturnCoins2();
	}

	@Override
	public DisposeDrink makeObjectDisposeDrink() {
		// Get object of return coins 2 for vending machine 2
		return new DisposeDrink2();
	}

	@Override
	public DisposeAdditive makeObjectDisposeAdditive() {
		// Get object of dispose Additive class 2 for vending machine 2
		return new DisposeAdditive2();
	}

}
