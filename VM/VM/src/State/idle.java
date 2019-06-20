/*
 * idle
 * this class represent the idle state class
 * This class is mainly called when system is ready to take beverage orders  
 * Main methods for this state is card,set,price,insert_cups and coin
 * Other methods should not execute on this so, message is printed
 */
package State;

import MDA_EFSM.MDA_EFSM;

public class idle extends State {

	public idle(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}

	/*
	 * This method will select the card method
	 * will set cf to zero
	 * will reset additive array
	 * and will change state from 2 to 3
	 */
	public void card() {
		if (m.getObject().S == m.getObject().LS[2]) {
			m.getObject().p.ZeroCF();
			m.getObject().change_state(3);
			m.getObject().resetArray();
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method is used when to set the new price of beverage
	 * so the meta action store price is called
	 * that will change the new price which is store in temp_p to p 
	 */
	public void set_price() {
		if (m.getObject().S == m.getObject().LS[2]) {
			m.getObject().p.StorePrice();
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method will insert more cups
	 * will increase k value by n
	 */
	public void insert_cups(int n) {
		if (m.getObject().S == m.getObject().LS[2]) {
			m.getObject().k = m.getObject().k + n;
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method coin have argument f , 
	 * you increase cf
	 * if 0 then not sufficient fund, print message that fund is not sufficient
	 * if 1 then you , change state to 3 and reset additive array by setting all values to 0
	 * 
	 */
	public void coin(int f) {
		if (m.getObject().S == m.getObject().LS[2]) {
			m.getObject().p.IncreaseCF();
			if (f == 1) {
				m.getObject().change_state(3);
				m.getObject().resetArray();
			} else {
				System.out.println("Not sufficient fund! Add more money");
			}
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void cancel() {
		System.out.println("System can not peform this opreation.You can either add money options, cups or set the price at this stage.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void dispose_drink(int d) {
		System.out.println("System can not peform this opreation.You can either add money options, cups or set the price at this stage.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void additive(int a) {
		System.out.println("System can not peform this opreation.You can either add money options, cups or set the price at this stage.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void create() {
		System.out.println("System can not peform this opreation.You can either add money options, cups or set the price at this stage.");
	}

}
