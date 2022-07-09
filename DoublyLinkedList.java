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

class DoublyLinkedList {
	private Node first;
	private Node last;

	// -------------------------------------------------------------
	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() {
		return first == null;
	}

	// -------------------------------------------------------------
	public void insertFirst(int num) {
		Node newNode = new Node(num);

		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			newNode.next = first;
			first.previous = newNode;
			first = newNode;
		}
	}

	// -------------------------------------------------------------
	public void insertLast(int num) {
		Node newNode = new Node(num);

		if (last == null) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	// insert newNumber just after numToFind
	public boolean insertAfter(int numToFind, int newNumber) { // (assumes non-empty list)

		Node currentNode = first;
		while (currentNode != null && currentNode.mData != numToFind) {
			currentNode = currentNode.next;
		}

		if (currentNode != null) {
			Node next = currentNode.next;
			Node newNode = new Node(newNumber);
			currentNode.next = newNode;
			newNode.previous = currentNode;
			if (next != null) {
				next.previous = newNode;
				newNode.next = next;
			} else {
				last = newNode;
			}
			return false;
		}
		return true;

	}

	// ------------------------------------------------// delete first node

	public Node deleteFirstNode() {

		if (first != null) {
			if (first.next == null) {
				first = null;
				last = null;
			} else {
				first = first.next;
				first.previous = last;
			}
		}
		return first.next;

	}

	// -----------------------------------------------// delete last node

	public Node deleteLastNode() {
		Node currentNode = first;
		if (first == null || first.next == null) {
			deleteFirstNode();
		} else {

			Node previous = null;
			while (currentNode != last) {
				previous = currentNode;
				currentNode = currentNode.next;
			}
			previous.next = null;
			last = previous;
		}
		return currentNode;
	}

	// -------------------------------------------------------------

	// -----------------------------------------finds, deletes and returns the node
	// that contains the given int value
	public Node searchAndDelete(int number) {
		Node currentNode = first;
		Node previous = null;
		while (currentNode != null && currentNode.mData != number) {
			previous = currentNode;
			currentNode = currentNode.next;
		}

		if (currentNode != null) {
			previous.next = currentNode.next;
			currentNode.next.previous = previous;
		}
		return currentNode;
	}

	// -------------------------------------------display data from first node to
	// last node
	public void printForwards() {

		Node temp = first;
		System.out.print("Linked List: [From first_to_last]: ");
		while (temp != null) {
			System.out.print(temp.mData + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	// -------------------------------------------display data from last node to
	// first node
	public void printBackwards() {

		Node temp = last;
		System.out.print("Linked List: [From last_to_first]: ");
		while (temp != null) {
			System.out.print(temp.mData + " ");
			temp = temp.previous;
		}
		System.out.println();

	}
	// -------------------------------------------------------------
} // end class DoublyLinkedList

// ==========================================================
