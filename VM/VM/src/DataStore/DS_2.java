/*
 * Data Store 2
 * The variable which are concerned to Vending Machine 2 
 * This class contains data variable for VM 2 and getter setter method for each
 */
package DataStore;

public class DS_2 extends DataStore {
	public float temp_p;
	public float temp_v;
	public float price;
	public float cf;
	
	public float getfloatTemp_p() { // get value of temp_p variables, return type float
		return temp_p;
	}
	public void setTemp_p(float temp_p) {
		this.temp_p = temp_p;		//set value of temp_p variables, type float
	}
	public float getfloatTemp_v() {	//get value of temp_v variables, return type float
		return temp_v;
	}
	public void setTemp_v(float temp_v) { 	// set value of temp_v variables, type float
		this.temp_v = temp_v;
	}
	public float getfloatPrice() {	//get value of price variables, return type float
		return price;
	}
	public void setPrice(float price) {	// set value of price variables, type float
		this.price = price;
	}
	public float getfloatCf() {	// get value of cf variables, return type float
		return cf;
	}
	public void setCf(float cf) {	// set value of cf variables, type float
		this.cf = cf;
	}
	
}
