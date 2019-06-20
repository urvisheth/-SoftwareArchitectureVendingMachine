/*
 * DataStore
 * DataStore class is used to store data
 * This is a parent DataStore class
 * This will have list of all methods that are defined in both data stores
 * just the null definition. this will not have an impact
 * This class is connected to VM1, VM2 and OP
 * THe child DataStore Classes are connected to Child abstract factory classes according to the version
 */

package DataStore;

public class DataStore {

	/*
	 * methods for DATA STORE 1
	 * 
	*/
	public int getTemp_p() {	// this method is just parent definition for child class, it does nothing here but it will get value of temp_p variables, return type int
		return 0;
	}
	
	public void setTemp_p(int temp_p) {	// this method is just parent definition for child class, it does nothing here but it will set value of temp_p variables, type int
		
	}
	public int getTemp_v() { // this method is just parent definition for child class, it does nothing here but it will get value of temp_v variables, return type int
		return 0;
	}
	public void setTemp_v(int temp_v) {	// this method is just parent definition for child class, it does nothing here but it will set value of temp_v variables, type int
		
	}
	public int getPrice() {	// this method is just parent definition for child class, it does nothing here but it will get value of price variables, return type int
		return 0;
	}
	public void setPrice(int price) {	// this method is just parent definition for child class, it does nothing here but it will set value of price variables, type int
		
	}
	public int getCf() {	// this method is just parent definition for child class, it does nothing here but it will get value of cf variables, return type int
		return 0;
	}
	public void setCf(int cf) {	// this method is just parent definition for child class, it does nothing here but it will set value of price variables, type int
		
	}

	

	/*
	 * methods for DATA STORE 2
	 * 
	*/
	public float getfloatTemp_p() {	// this method is just parent definition for child class, it does nothing here but it will get value of temp_p variables, return type float
		return 0;
	}
	public void setTemp_p(float temp_p) {	// this method is just parent definition for child class, it does nothing here but it will set value of temp_p variables, type float
		
	}
	public float getfloatTemp_v() {	 // this method is just parent definition for child class, it does nothing here but it will get value of temp_v variables, return type float
		return 0;
	}
	public void setTemp_v(float temp_v) {	// this method is just parent definition for child class, it does nothing here but it will set value of temp_v variables, type float
		
	}
	public float getfloatPrice() {	// this method is just parent definition for child class, it does nothing here but it will get value of price variables, return type float
		return 0;
	}
	public void setPrice(float price) {	// this method is just parent definition for child class, it does nothing here but it will set value of price variables, type float
	}
	public float getfloatCf() {	// this method is just parent definition for child class, it does nothing here but it will get value of cf variables, return type float
		return 0;
	}
	public void setCf(float cf) {	// this method is just parent definition for child class, it does nothing here but it will set value of price variables, type float
	}
	
}
