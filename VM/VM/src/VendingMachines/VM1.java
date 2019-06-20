/**
 * This class will perform all the operations that should be done by vending machine 1
 * 
 */
package VendingMachines;

import DataStore.*;
import MDA_EFSM.*;
import AbstractFactory.*;

public class VM1 {

	DS_1 d1;
	AbstractFactory af;
	MDA_EFSM m;

	public VM1() {
		// create client factory CF1 object
		af = new CF1();
		// creates an CF1 object and returns its address
		d1 = new DS_1();
		m = new MDA_EFSM();
		m.intialize(af, (DataStore) d1);
	}

	public void create(int p) {
		// This will create the Virtual Machine with the value of p as beverage value
		d1.setTemp_p(p);
		m.create();
	}

	public void coin(int v) {
		// This will check funds for the drink. If the funds are sufficient, it will send 1 otherwise zero
		d1.setTemp_v(v);
		int cf = d1.getCf();
		int price = d1.getPrice();
		if ((cf + v) >= price) {
			m.coin(1);
		} else {
			m.coin(0);
		}
	}
	
	public void sugar() {
		m.additive(1); //here additive value 1 is sugar 
	}

	public void tea() {
		m.dispose_drink(1); // here drink type 1 is tea
	}

	public void chocolate() {
		m.dispose_drink(2); // here drink type 2 is chocolate
	}

	public void insert_cups(int n) {
		m.insert_cups(n);  // adding cup to system, this will call insert_cups for MDA_EFSM
	}

	public void set_price(int price) {
		//setting new price for drink, the new price will be assigned to temp_p and Store Price will be called
		d1.setTemp_p(price); 
		m.set_price();
	}

	public void cancel() {
		m.cancel(); 	// cancel the transaction	
	}

	public void card(float x) {
		m.card();	// card method is called
	}



}
