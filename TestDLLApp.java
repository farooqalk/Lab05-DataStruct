/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * 
 * Professor: James Mwangi PhD
 * 
 * Lab 5 -TestDDLApp
 * Student Name: Farooq Al-Khaffaf
 * Student ID: 041025585
 * Program: CET - CS
 * Course: CST8130
 * Lab Section: 302
 * 
 */

class TestDLLApp {
	public static void main(String[] args) {

		// write your lines of code here
		DoublyLinkedList DLL = new DoublyLinkedList();
		DLL.insertFirst(22);
		DLL.insertFirst(44);
		DLL.insertFirst(74);
		DLL.insertFirst(97);
		DLL.insertLast(9);
		DLL.insertLast(33);
		DLL.insertLast(55);

		System.out.println("The list from head is ");
		DLL.printForwards();
		System.out.println("The list from tail is ");
		DLL.printBackwards();

		System.out.println("Deleting First Node.");
		DLL.deleteFirstNode();
		//System.out.println("The list from head is ");
		//DLL.printForwards();
		System.out.println("Deleting Last Node.");
		DLL.deleteLastNode();
		//System.out.println("The list from tail is ");
		//DLL.printBackwards();
		DLL.searchAndDelete(9);
		System.out.println("The list from head is ");
		DLL.printForwards();
		DLL.insertAfter(22, 69);
		DLL.insertAfter(33, 88);
		System.out.println("The list from head is ");
		DLL.printForwards();

	} // end of main() method
} // end class TestDLLApp
