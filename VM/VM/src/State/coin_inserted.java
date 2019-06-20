/*
 * coin_inserted
 * this class represent the coin_inserted state class
 * This class is mainly after coin or money value is inserted 
 * Main methods for this state is cancel, dispose_drink, additive and coin
 * Other methods should not execute on this so, message is printed
 */
package State;

import MDA_EFSM.MDA_EFSM;

public class coin_inserted extends State {

	public coin_inserted(MDA_EFSM mda_EFSM) {
		super(mda_EFSM);
	}

	/*
	 * This method will cancel the transaction
	 * will set cf to zero
	 * it will return the coins
	 * and will change state from 3 to 2
	 */
	public void cancel() {
		if (m.getObject().S == m.getObject().LS[3]) {
			m.getObject().p.ZeroCF();
			m.getObject().p.ReturnCoins();
			m.getObject().change_state(2);
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * this method will dispose drink
	 * argument is passed is the type of drink
	 * if the last cup is left you dispose drink, dispose additive change the state to 1
	 * if not then dispose drink, dispose additive. decrease cup count, set cf to zero and change the state to 2
	 */
	public void dispose_drink(int d) {
		MDA_EFSM obj = m.getObject();
		if (obj.S == obj.LS[3]) {
			if (obj.k > 1) {
				obj.p.DisposeAdditive(obj.A);
				obj.p.DisposeDrink(d);
				obj.k = obj.k - 1;
				obj.p.ZeroCF();
				obj.change_state(2);
			} else if (obj.k <= 1) {
				obj.p.DisposeAdditive(obj.A);
				obj.p.DisposeDrink(d);
				obj.change_state(1);
			}
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}
	
	/*
	 * Additive
	 * This method will select or de-select the additive
	 * if sugar is selected then a = 1
	 * if cream is selected then a = 2
	 * if sugar is pressed when cream was already selected,
	 * or cream is pressed when sugar was already selected,
	 * the additive_type will be sugar-cream then you have to set a = 3, using conditions
	 */

	public void additive(int a) {
		MDA_EFSM obj  = m.getObject();
		if (obj.S == obj.LS[3]) {
			if (obj.A[3] != 1) { // do this when sugar-cream is not selected
				if (a == 1 && obj.A[2] == 1) { // if cream is already pressed and sugar is selected, go to option 3 which is sugar cream
					a = 3;
					obj.A[2] = 0;
				} else if (a == 2 && obj.A[1] == 1) { // if sugar is already pressed and cream is selected, go to option 3 which is sugar cream
					a = 3;
					obj.A[1] = 0;
				}
				// the above code is condition for a =3
				obj.A[a] = (obj.A[a] == 0) ? 1 : 0; //select or deselect additive
			} else {
				// if you have to deselect sugar-cream
				obj.A[3] = 0;
				if (a == 1) { // if sugar is pressed to be deselected, only additive cream should be having value 1 , i.e. only A[2] = 1 others 0
					obj.A[1] = 0;
					obj.A[2] = 1;
				} else { // if cream is pressed to be deselected, only additive sugar should be having value 1 , i.e. only A[1] = 1 others 0
					obj.A[1] = 1;
					obj.A[2] = 0;
				}
			}
			String name = (a == 2) ? "cream" : ((a == 3) ? "sugar-cream" : "sugar");
			System.out.println("Additive " + name + " is " + ((obj.A[a] == 1) ? "Selected!" : "Deselected!"));
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void insert_cups(int n) {
		System.out.println("You can not create the Vending machine nor change the price nor payment method.");
	}

	/*
	 * This method coin will return the coins for this state
	 */
	public void coin(int f) {
		if (m.getObject().S == m.getObject().LS[3]) {
			m.getObject().p.ReturnCoins();
		} else {
			System.out.println("This opreation is not Valid on current state");
		}
	}
	
	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void card() {
		System.out.println("You can neither create the Vending machine nor change the price or payment method.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void set_price() {
		System.out.println("You can neither create the Vending machine nor change the price or payment method.");
	}

	/*
	 * This method should not be executed on this state, so just message is printed no action performed
	 */
	public void create() {
		System.out.println("You can neither create the Vending machine nor change the price or payment method.");
	}
}
