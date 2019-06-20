/**
 * This is the main Driver class
 * This class will initialize the system, i.e. this class will be called first in application
 * It will ask for the choice of the vending machines 
 * and it will initialize the class objects according to selection
 */
package main;

import java.util.Scanner;
import VendingMachines.*;

public class Driver {

	public static void main(String[] args) {

		System.out.println("This is submission for CS-586");
		System.out.println("By A20430232 - Urvi Sheth");
		System.out.println("Hello, Welcome to Vending Machine");
		System.out.println("We Have Two Types of Machines for You");
		System.out.println("Vending Machine-1: Servers You Tea/Chocolate with/without sugar");
		System.out.println("Vending Machine-2: Servers You Coffee with/without sugar/cream/both");
		System.out.println("Select Vending Machine-1 or Vending Machine-2");
		System.out.println("Press 1 for Vending Machine-1");
		System.out.println("Press 2 for Vending Machine-2");
		System.out.println("Please enter your choice:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		switch (input) {
		case "1":
			createVendingMachine1();   // creates Virtual Machine 1
			break;
		case "2":
			createVendingMachine2(); // creates Virtual Machine 2
			break;
		}
		sc.close();
	}
	
	// creates Vending Machine 2

	private static void createVendingMachine2() {
		VM2 virtualMachine2 = new VM2();
		System.out.println("\n\n\nWelcome to Vending Machine 2");
		System.out.println(" MENU of Operations");
		System.out.println(" 0. CREATE(float p);");
		System.out.println(" 1. COIN(float v);");
		System.out.println(" 2. SUGAR();");
		System.out.println(" 3. CREAM(); ");
		System.out.println(" 4. COFFEE(); ");
		System.out.println(" 5. InsertCups(int n); ");
		System.out.println(" 6. SetPrice(float p); ");
		System.out.println(" 7. CANCEL(); ");
		System.out.println(" q. Quit the program");
		Character ch = new Character('1');
		Scanner sc = new Scanner(System.in);
		while (ch != 'q') {
			showVM2options();
			ch = sc.next().charAt(0);
			switch (ch) {
			case '0':
				System.out.println("\n Opreation CREATE");
				System.out.println("Enter the intial price p value(float):");
				float p = sc.nextFloat();
				virtualMachine2.CREATE(p);
				break;
			case '1':
				System.out.println("\n Opreation COIN");
				System.out.println("Enter the intial price v value(float):");
				float v = sc.nextFloat();
				virtualMachine2.COIN(v);
				break;
			case '2': // sugar
				System.out.println(" Operation: SUGAR()");
				virtualMachine2.SUGAR();
				break;
			case '3': // cream
				System.out.println(" Operation: CREAM()");
				virtualMachine2.CREAM();
				break;
			case '4': // coffee
				System.out.println(" Operation: COFFEE()");
				virtualMachine2.COFFEE();
				break;
			case '5': // InsertCups
				System.out.println(" Operation: InsertCups()");
				System.out.println("Enter the intial cup count n value(int):");
				int n = sc.nextInt();
				virtualMachine2.InsertCups(n);
				break;
			case '6': // SetPrice
				System.out.println(" Operation: SetPrice()");
				System.out.println("Enter the new price value(float):");
				float price = sc.nextFloat();
				virtualMachine2.SetPrice(price);
				break;
			case '7': // CANCEL
				System.out.println(" Operation: CANCEL()");
				virtualMachine2.CANCEL();
				break;
			}
		}
		System.out.println("Successfully done");
		sc.close();
	}

	//creates vending Machine 1
	
	private static void createVendingMachine1() {

		VM1 virtualMachine1 = new VM1();
		// The method will initialize the class object and ask for the options
		System.out.println("\n\n\nWelcome to Vending Machine 1");
		System.out.println(" MENU of Operations");
		System.out.println(" 0. create(int)");
		System.out.println(" 1. coin(int)");
		System.out.println(" 2. sugar()");
		System.out.println(" 3. tea()");
		System.out.println(" 4. chocolate()");
		System.out.println(" 5. insert_cups(int)");
		System.out.println(" 6. set_price(int)");
		System.out.println(" 7. cancel()");
		System.out.println(" 8. card(float)");
		System.out.println(" q. Quit the program");
		Character ch = new Character('1');
		Scanner sc = new Scanner(System.in);
		try {
			while (ch != 'q') {
				showVM1options();
				ch = sc.next().charAt(0);
				switch (ch) {
				case '0':
					System.out.println("\n Opreation Create");
					System.out.println("Enter the intial price p value(int):");
					int p = sc.nextInt();
					virtualMachine1.create(p);
					break;
				case '1':
					System.out.println("\n Opreation Coin");
					System.out.println("Enter the intial price v value(int):");
					int v = sc.nextInt();
					virtualMachine1.coin(v);
					break;
				case '2': // sugar
					System.out.println(" Operation: sugar()");
					virtualMachine1.sugar();
					break;
				case '3': // tea
					System.out.println(" Operation: Tea()");
					virtualMachine1.tea();
					break;
				case '4': // chocolate
					System.out.println(" Operation: Chocolate()");
					virtualMachine1.chocolate();
					break;
				case '5': // insert_cups
					System.out.println(" Operation: insert_cups()");
					System.out.println("Enter the intial cup count n value(int):");
					int n = sc.nextInt();
					virtualMachine1.insert_cups(n);
					break;
				case '6': // set_price
					System.out.println(" Operation: set_price()");
					System.out.println("Enter the new price value(int):");
					int price = sc.nextInt();
					virtualMachine1.set_price(price);
					break;
				case '7': // cancel
					System.out.println(" Operation: cancel()");
					virtualMachine1.cancel();
					break;
				case '8': // card
					System.out.println(" Operation: card(float x)");
					System.out.println("Enter the card value x(float):");
					float x = sc.nextFloat();
					virtualMachine1.card(x);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Exception generated " + e);
		}
		System.out.println("Successfully done. Please visit us again!!");
		sc.close();

	}

	// to print vending machine 1 options
	
	public static void showVM1options() {
		System.out.print("\n0-create, ");
		System.out.print("1-coin, ");
		System.out.print("2-sugar, ");
		System.out.print("3-tea, ");
		System.out.print("4-chocolate, ");
		System.out.print("5-insert_cups, ");
		System.out.print("6-set_price, ");
		System.out.print("7-cancel, ");
		System.out.print("8-card, ");
		System.out.print("q-quit, ");
		System.out.print("\nEnter Your Choice:");

	}

	
	// to print options for Vending Machine 2
	public static void showVM2options() {
		System.out.print("\n0-CREATE, ");
		System.out.print("1-COIN, ");
		System.out.print("2-SUGAR, ");
		System.out.print("3-CREAM, ");
		System.out.print("4-COFFEE, ");
		System.out.print("5-InsertCups, ");
		System.out.print("6-SetPrice, ");
		System.out.print("7-CANCEL, ");
		System.out.print("q-quit, ");
		System.out.print("\nEnter Your Choice:");

	}

}
