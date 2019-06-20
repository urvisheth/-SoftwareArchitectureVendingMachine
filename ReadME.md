-
System Architecture for a Working Vending Machine
-

**Goal:**
The goal of this project is to design two different Vending Machine (VM) components using the Model-Driven Architecture (MDA) and then implement these Vending Machine components based on this design using JAVA.

**Diagram** folder consists of **different type of UML Diagrams To understand the project**

**VM** folder consist of an eclipse java project made for implementation of Vending Machine using MDA-EFSM

**project.exe** is runnable version of the above project which is a black consoled executable

**Description of the Project:**
There are two Vending Machine components: **VM-1 and VM-2**.
	
	VM-1 component supports the following operations:
		create(int p); 			// starts a vending machine application, where p is an initial price of a drink
		coin(int v); 			// a coin with value v is inserted
		credit(float x); 		// credit card is swiped, where x is an available fund
		sugar(); 			// sugar button is pressed
		tea(); 				// tea button is pressed
		chocolate(); 			// chocolate button is pressed
		insert_cups(int n); 		// n cups are inserted into the vending machine
		set_price(int p); 		// new price of a cup of tea/chocolate is set to value p
		cancel(); 			// cancel selection for a cup of tea or hot chocolate

	VM-2 component supports the following operations:
		CREATE(float p); 			// starts a vending machine application, where p is an initial price of a drink
		COIN(float v); 				// a coin with value v is inserted
		SUGAR(); 				// sugar button is pressed
		CREAM(); 				// cream button is pressed
		COFFEE(); 				// coffee button is pressed
		InsertCups(int n); 			// n cups are inserted into the vending machine
		SetPrice(float p); 			// new price of a cup of coffee is set to value p
		CANCEL(); 				// cancel selection for a cup of coffee
		

Both Vending Machine components are state-based components that control simple vending machines.

These vending machines dispose of a cup of tea/coffee/chocolate with or without additives (sugar and/or cream). The detailed behavior of both Vending Machine components is specified using EFSM. The EFSM of Figure 1 shows the detail behavior of VM-1, and the EFSM of Figure 2 shows the detailed behavior of VM-2. Notice that there are several differences between both Vending Machines.


Aspects that vary between two Vending Machine components:

	a. Different methods of payment
	b. Different drinks disposed
	c. Different additives offered
	d. Different messages displayed
	e. Different operation names and signatures
	f. Different data types
	g. etc.

The goal of this project is to design two VM components using the Model-Driven Architecture (MDA). An executable meta-model, referred to as MDA-EFSM, of VM components captures the “generic behavior” of two VM components and are de-coupled from data and implementation details and then implement these Vending Machine components based on this design using the OO programming language like JAVA.

In this design,the following OO design patterns are included:
	
	1. A class diagram
	2. state pattern
	3. strategy pattern
	4. abstract factory pattern
	5. state diagram/model
	
	

