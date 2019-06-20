/*
 * DisposeDrink1 Class
 * This class represents the meta action of Disposing drink for Vending Machine 1
 * This is a child class that will implement abstract methods of parent class having one abstract method of disposing drink
 * 
 */
package DisposeDrink;

public class DisposeDrink1 extends DisposeDrink {

	/*
	 * method to dispose drink, the argument is the drink type which is an integer with possibility of 3 values for
	 * each drink
	 * For vending machine 1 
	 * drink_type or d  = 1 , then drink is tea
	 * drink_type or d  = 2 , then drink is chocolate
	*/
	@Override
	public void disposeDrink(int d) {
		switch (d) {
		case 1:
			System.out.println("Tea Disposed! Enjoy your Tea!");
			break;
		case 2:
			System.out.println("Chocolate drink Disposed! Enjouy your Chocolate drink!");
			break;
		}
	}

}
