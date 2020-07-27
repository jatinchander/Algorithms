/*Data Structures are collections of values, the relationships among them, and the functions or operations that can be applied to the data.*/
package dataStructures;

public class SLL {
	/*
	 * Linked list is a data structure that contains a head, tail, and length
	 * property. Linked Lists consists of nodes, and each node has a value and a
	 * pointer to another node or null.
	 * Example: (HEAD)|4| --> |15| --> |7| --> |40|(TAIL) --> NULL
	 */
	
	Node head = null;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		SLL list = new SLL();
		list.insert(list, 4);
		list.insert(list, 15);
		list.insert(list, 7);
		list.insert(list, 40);
		
		printList(list);
	}
	
		
	// Node Class
	static class Node {
		// pointer
		Node next;
		// value
		int data;

		// constructor
		public Node(int data) {
			this.data = data;
			next = null;
		} // end constructor
	} // end node class
	
	// helper print method
	public static void printList(SLL list) { 
        Node temp = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (temp != null) { 
            // Print the data at current node 
            System.out.print("|" + temp.data + "| --> "); 
   
            // Go to next node 
            temp = temp.next; 
        } 
        
        System.out.print("NULL");
    } 
	
	// insert method
	public static SLL insert(SLL list, int data) {
		// Create a new node
		Node newNode = new Node(data);
		newNode.next = null;
		
		// empty list
		if(list.head == null) {
			list.head = newNode;
		}
		else {
			Node temp = list.head;
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next = newNode;
		}
		
		return list;
	}
} // end SLL class
