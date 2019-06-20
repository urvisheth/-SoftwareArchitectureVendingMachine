/*
 * CF1
 * Concrete Factory 1
 * Child of Abstract Factory
 * This will create required Output Class objects to use Vending Machine 1
 * 
 */
package AbstractFactory;

import DisposeAdditive.*;
import DisposeDrink.*;
import IncreaseCF.*;
import ReturnCoins.*;
import StorePrice.*;
import ZeroCF.*;

public class CF1 extends AbstractFactory {

	@Override
	public StorePrice makeObjectStorePrice() {
		// Get object of store price class 1 for vending machine 1
		return new StorePrice1();
	}

	@Override
	public ZeroCF makeObjectZeroCF() {
		// Get object of zero cumulative factor price class 1 for vending machine 1
		return new ZeroCF1();
	}

	@Override
	public IncreaseCF makeObjectIncreaseCF() {
		// Get object of increase cumulative factor price class 1 for vending machine 1
		return new IncreaseCF1();
	}

	@Override
	public ReturnCoins makeObjectReturnCoins() {
		// Get object of return coins 1 for vending machine 1
		return new ReturnCoins1();
	}

	@Override
	public DisposeDrink makeObjectDisposeDrink() {
		// Get object of dispose drink class 1 for vending machine 1
		return new DisposeDrink1();
	}

	@Override
	public DisposeAdditive makeObjectDisposeAdditive() {
		// Get object of dispose Additive class 1 for vending machine 1
		return new DisposeAdditive1();
	}

}
