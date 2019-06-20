/*
 * DisposeAdditive1 Class
 * This class represents the meta action of Disposing Additive for Vending Machine 2
 * This is a child class that will implement abstract methods of parent class having one abstract method of disposing Additive
 * 
 */
package DisposeAdditive;

public class DisposeAdditive2 extends DisposeAdditive {

	/*
	 * method to dispose drink with additive, the argument is the additive array which have 3 values for
	 * each additive 
	 * A[sugar = 1] = 0 if additive is not selected , 1 if additive is selected
	 * A[cream = 1] = 0 if additive is not selected , 1 if additive is selected
	 * A[sugar-cream = 1] = 0 if additive is not selected , 1 if additive is selected
	*/
	@Override
	public void disposeAdditive(int[] A) {
		if(A[1] == 1) {
			System.out.println("Hola Your drink Have Additive Sugar!");
		}
		if(A[2] == 1) {
			System.out.println("Hola Your drink Have Additive Cream!");
		}
		if(A[3] == 1) {
			System.out.println("Hola Your drink Have Additive Sugar-Cream!");
		}
		
	}

}
