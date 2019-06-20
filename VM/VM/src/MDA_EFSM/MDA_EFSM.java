/*
 * This is a MDA_EFSM class 
 * This class have 5 variables
 * Op p :  p pointer is the pointer class to Output Processor OP
 * int k: k represents the number of cups for that instance of Vending Machine
 * int A[]: Array to store value for different kind of additives
 * 		A[1] = 1 if sugar is selected, 0 if not selected
 * 		A[2] = 1 if cream is selected, 0 if not selected  
 * 		A[3] = 1 if sugar-cream is selected, 0 if not selected
 * State LS[] : Array to represent all the State objects Available for the system
 * 		in this project
 * 		LS[0] = object of active state class
 * 		LS[1] = object of no_cups state class
 * 		LS[2] = object of idle state class
 * 		LS[3] = object of coin_inserted class
 * State S : pointer to the current state class
 * 
 * this class will be having meta events as methods of the class which 
 * will be calling corresponding state classes and that state classes will call meta action in OP. 
 * 
 * this class is connected to VM-1, VM-2 and State class
 * 
 */
package MDA_EFSM;

import AbstractFactory.AbstractFactory;
import DataStore.DataStore;
import OP.OP;
import State.*;

public class MDA_EFSM {

	public OP p;
	public int k;
	public int A[];
	public State LS[];
	public State S;

	/*
	 * Constructor of the class, initialize all the data variables. 
	 */
	public MDA_EFSM() {
		LS = new State[4];
		p = new OP();
		S = new State(this);
		LS[0] = new activate(this);
		LS[1] = new no_cups(this);
		LS[2] = new idle(this);
		LS[3] = new coin_inserted(this);
		A = new int[4]; // taking A from 1 to 3 and array have indexes from 0 so length is 4
		change_state(0);
	}

	// to call create method from S object
	public void create() {
		S.create();
	}

	// calls insert_cups method for S object, takes n as number of cups
	public void insert_cups(int n) {
		S.insert_cups(n);
	}

	// calls coin method of state class, takes f as 1 to show the fund is sufficient or 0 that shows non sufficient fund
	public void coin(int f) {
		S.coin(f);
	}

	// method to reset Additive array values to 0
	public void resetArray() {
		for (int i = 1; i <= 3; i++) {
			A[i] = 0;
		}
	}

	// calls card method of state class
	public void card() {
		S.card();
	}

	// calls cancel method of state class
	public void cancel() {
		S.cancel();
	}

	// calls set_price method of corresponding state class
	public void set_price() {
		S.set_price();
	}

	// to call dispose_drink method of State class with argument as corresponding drink_type value
	public void dispose_drink(int d) {
		S.dispose_drink(d);
	}

	// to call additive method of State class with argument as corresponding additive_type chosen
	public void additive(int a) {
		S.additive(a);
	}
	
	// this method will set the state pointer S to a value, a values will be 0-activate , 1-no_cups, 2-idle, 3-coin_inserted
	public void change_state(int a) {
		S = LS[a];
	}

	/* 
	 * this method is called at the point of initialization of vending machines
	 * this method will call the initialize method in OP class to initialize 
	 * the abstract factory that can get the needed output objects to complete the execution
	 * this methods takes object of abstract factory and data store which was passed as per the version of vending machine   
	*/
	public void intialize(AbstractFactory af, DataStore d) {
		p.intialize(af, d);
	}
	
	// this method will return current MDA_EFSM object
	public MDA_EFSM getObject() {
		return this;
	}

}
