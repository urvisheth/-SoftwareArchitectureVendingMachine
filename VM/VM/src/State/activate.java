/*
 * activate
 * this class represent the activate state class
 * This class is mainly used to start the system 
 * Main method for this state is create
 */
package State;

import MDA_EFSM.MDA_EFSM;

public class activate extends State {

	public activate(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}

	/*
	 * This method is to execute create the instance for creating object
	 * it will call the store price meta action method on output processor
	 * and change the state from 0 to 1
	 * 
	 */
	public void create() {
		if (m.getObject().S == m.getObject().LS[0]) {
			m.getObject().p.StorePrice();
			m.getObject().change_state(1);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void insert_cups(int n) {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}
	
	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void coin(int f) {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void card() {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void cancel() {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}
	
	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void set_price() {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void dispose_drink(int d) {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void additive(int a) {
		System.out.println("Please call create method first. System needs to be instantiated.");
	}

}
