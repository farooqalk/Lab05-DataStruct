/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * 
 * Professor: James Mwangi PhD
 * 
 * Lab 5 - DoublyLinkedList
 * Student Name: Farooq Al-Khaffaf
 * Student ID: 041025585
 * Program: CET - CS
 * Course: CST8130
 * Lab Section: 302
 * 
 */

// ===================== class starts here=============================
class Node {
	public int mData; // data item
	public Node next; // next node in list
	public Node previous; // previous node in list
	// -------------------------------------------------------------

	public Node(int d) // constructor
	{
		mData = d;
	}

	// -------------------------------------------------------------
	// display this node data
	public void displayNode() {
		System.out.print(mData + " ");
	}
	// -------------------------------------------------------------
} // end class Node