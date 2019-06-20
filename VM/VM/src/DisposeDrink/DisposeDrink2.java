/*
 * DisposeDrink2 Class
 * This class represents the meta action of Disposing drink for Vending Machine 2
 * This is a child class that will implement abstract methods of parent class having one abstract method of disposing drink
 * 
 */
package DisposeDrink;

public class DisposeDrink2 extends DisposeDrink{

	/*
	 * method to dispose drink, the argument is the drink type which is an integer with possibility of 3 values for
	 * each drink 
	 * For Vending Machine 2
	 * drink_type or d  = 3 , then drink is coffee
	*/
	@Override
	public void disposeDrink(int d) {
		if(d==3) {
			System.out.println("Coffee Disposed! Enjoy Your Coffee!!");
		}
	}

}
