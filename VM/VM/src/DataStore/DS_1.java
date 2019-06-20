/*
 * Data Store 1
 * The variable which are concerned to Vending Machine 1 
 * This class contains data variable for VM 1 and getter setter method for each
 */


package DataStore;

public class DS_1 extends DataStore {
	public int temp_p;
	public int temp_v;
	public int price;
	public int cf;
	
	public int getTemp_p() { // get value of temp_p variables, return type int
		return temp_p;
	}
	public void setTemp_p(int temp_p) {
		this.temp_p = temp_p;		//set value of temp_p variables, type int
	}
	public int getTemp_v() {	//get value of temp_v variables, return type int
		return temp_v;
	}
	public void setTemp_v(int temp_v) { 	// set value of temp_v variables, type int
		this.temp_v = temp_v;
	}
	public int getPrice() {	//get value of price variables, return type int
		return price;
	}
	public void setPrice(int price) {	// set value of price variables, type int
		this.price = price;
	}
	public int getCf() {	// get value of cf variables, return type int
		return cf;
	}
	public void setCf(int cf) {	// set value of cf variables, type int
		this.cf = cf;
	}
	

}


