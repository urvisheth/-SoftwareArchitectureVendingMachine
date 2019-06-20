/**
 * This class will perform all the operations that should be done by vending machine 2
 * 
 */
package VendingMachines;

import AbstractFactory.AbstractFactory;
import AbstractFactory.CF2;
import DataStore.DS_2;
import DataStore.DataStore;
import MDA_EFSM.MDA_EFSM;

public class VM2 {

	DataStore d2;
	AbstractFactory af;
	MDA_EFSM m;

	public VM2() {
		// this method will create client factory CF1 object
		af = new CF2();
		// this method will creates an CF1 object and returns its address
		d2 = new DS_2();
		m = new MDA_EFSM();
		m.intialize(af, (DataStore) d2);
	}

	public void CREATE(float p) {
		// this method will This will create the Vm machine with the value of p as
		// beverage value
		d2.setTemp_p(p);
		m.create();
	}

	public void COIN(float v) {
		// this method will This will check funds for the drink. If the funds are
		// sufficient, it will
		// this method will send 1 otherwise zero
		d2.setTemp_v(v);
		float cf = d2.getfloatCf();
		float price = d2.getfloatPrice();
		if ((cf + v) >= price) {
			m.coin(1);
		} else {
			m.coin(0);
		}
	}

	public void SUGAR() {
		m.additive(1); // this method will set additive value to 1 as it is denoted by sugar
	}

	public void CREAM() {
		m.additive(2); // this method will set additive value to 2 as it is denoted by cream
	}

	public void COFFEE() {
		m.dispose_drink(3); // this method will set drink value to 3 as it is denoted by coffee
	}

	public void InsertCups(int n) {
		if (n > 0) {
			m.insert_cups(n); // this method will adding n cups to vending machine
		} else {
			System.out.println("Please enter value greater than 0");
		}
	}

	public void SetPrice(float price) {
		d2.setTemp_p(price); // this method sets the new price for the drink, the new price will be assigned
								// to temp_p and Store Price will be called
		m.set_price();
	}

	public void CANCEL() {
		m.cancel(); // this method will cancel the transaction
	}

}
