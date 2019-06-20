/*
 * no_cups
 * this class represent the no_cups state class
 * This class is mainly called when system is initialized value is set but no cups are inserted
 * Main methods for this state is insert_cups and coin
 * Other methods should not execute on this so, message is printed
 */
package State;

import MDA_EFSM.MDA_EFSM;

public class no_cups extends State {

	public no_cups(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}

	/*
	 * This method will take cup counts
	 * arg n is passed represents added cup counts
	 * this will set k to n
	 * change state to 2
	 */
	public void insert_cups(int n) {	
		if (m.getObject().S == m.getObject().LS[1]) {
			m.getObject().k = n;
			m.getObject().change_state(2);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method coin will return the coins for this state
	 */
	public void coin(int f) {
		if (m.getObject().S == m.getObject().LS[1]) {
			m.getObject().p.ReturnCoins();
		} else {
			System.out.println("This opreation is not Valid on current state");
		}

	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void card() {
		System.out.println("There are no cups. Please insert Cups into the machine.");
	}
	

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void cancel() {
		System.out.println("There are no cups. Please insert Cups into the machine.");
	}


	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void set_price() {
		System.out.println("There are no cups. Please insert Cups into the machine.");
	}


	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void dispose_drink(int d) {
		System.out.println("There are no cups. Please insert Cups into the machine.");
	}


	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void additive(int a) {
		System.out.println("There are no cups. Please insert Cups into the machine.");
	}


	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void create() {
		System.out.println("There are no cups. Please insert Cups into the machine.");
	}

}
