/*
 * State Class
 * Generalized parent class to represent states for the particular system
 * have each state as child class
 * Follows "State Pattern" strategy with Decentralized approach
 * This Class is connected with MDA_EFSM and OP Class
 * This do not have any action to perform just used for generalization
 * each methods that are in each state is defined here with just a print statement as body
 * Here constructor will get MDA EFSM object for the actions in state class
 */
package State;

import MDA_EFSM.MDA_EFSM;

public class State {

	MDA_EFSM m;

	public State(MDA_EFSM mda_EFSM) {
		m = mda_EFSM;
	}

	public void insert_cups(int n) {
		System.out.println("In State Class");
	}

	public void coin(int f) {
		System.out.println("In State Class");
	}

	public void card() {
		System.out.println("In State Class");
	}

	public void cancel() {
		System.out.println("In State Class");
	}

	public void set_price() {
		System.out.println("In State Class");
	}

	public void dispose_drink(int d) {
		System.out.println("In State Class");
	}

	public void additive(int a) {
		System.out.println("In State Class");
	}

	public void create() {
		System.out.println("In State Class");
	}

}
