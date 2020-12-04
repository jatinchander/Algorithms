package dataStructures;

import java.util.Stack;

public class BST {
	
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(40);
		bst.insert(25);
		bst.insert(10);
		bst.insert(32);
		bst.insert(78);

		System.out.println("Recursive Preorder Traversal: ");
		bst.recursivePreOrder(bst.root);

		System.out.println();
		System.out.println("Recursive Inorder Traversal: ");
		bst.recursiveInOrder(bst.root);

		System.out.println();
		System.out.println("Recursive Postorder Traversal: ");
		bst.recursivePostOrder(bst.root);

		System.out.println();
		System.out.println("-------------------------------");

		System.out.println("Iterative Preorder Traversal: ");
		bst.iterativePreOrder(bst.root);

		System.out.println();
		System.out.println("Iterative Inorder Traversal: ");
		bst.iterativeInOrder(bst.root);

		System.out.println();
		System.out.println("Iterative Postorder Traversal: ");
		bst.iterativePostOrder(bst.root);

	}

	public Node root;

	public BST() {
		this.root = null;
	}

	public void insert(int value) {
		Node newNode = new Node(value);
		// Case 1: Empty tree
		if (this.root == null) {
			this.root = newNode;
			return;
		} else {
			// Case 2: Non-empty tree
			Node current = this.root;
			while (true) {
				// Case 2a: if the inserted value is less than the root/current node
				if (value < current.value) {
					if (current.left == null) {
						current.left = newNode;
						return;
					} else {
						current = current.left;
					}
					// Case 2b: if the inserted value is greater than the root/current node
				} else if (value > current.value) {
					if (current.right == null) {
						current.right = newNode;
						return;
					} else {
						current = current.right;
					}
				}
			}
		}
	} // end insert method

	// pre-order traversal of binary tree
	public void recursivePreOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.value + " ");
		recursivePreOrder(node.left);
		recursivePreOrder(node.right);
	}

	// post-order traversal of binary tree
	public void recursivePostOrder(Node node) {
		if (node == null)
			return;
		recursivePostOrder(node.left);
		recursivePostOrder(node.right);
		System.out.print(node.value + " ");
	}

	// in-order traversal of binary tree
	public void recursiveInOrder(Node node) {
		if (node == null) {
			return;
		}
		recursiveInOrder(node.left);
		System.out.print(node.value + " ");
		recursiveInOrder(node.right);
	}

	public void iterativePreOrder(Node node) {
		if (node == null) {
			return;
		}

		Stack<Node> stack = new Stack<Node>();
		Node current = node;

		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				System.out.print(current.value + " ");
				if (current.right != null) {
					stack.push(current.right);
				}
				current = current.left;
			}

			if (!stack.isEmpty()) {
				current = stack.pop();
			}
		}
	}

	public void iterativeInOrder(Node node) {
		if (node == null) {
			return;
		}

		Stack<Node> stack = new Stack<Node>();
		Node current = node;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			current = stack.pop();
			System.out.print(current.value + " ");
			current = current.right;
		}
	}

	public void iterativePostOrder(Node node) {
		Stack<Node> stack = new Stack<Node>();
		if (node == null) {
			return;
		}
		stack.push(node);
		Node prev = null;
		while (!stack.isEmpty()) {
			Node current = stack.peek();
			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null) {
					stack.push(current.left);
				} else if (current.right != null) {
					stack.push(current.right);
				} else {
					stack.pop();
					System.out.print(current.value + " ");
				}
			} else if (current.left == prev) {
				if (current.right != null) {
					stack.push(current.right);
				} else {
					stack.pop();
					System.out.print(current.value + " ");
				}
			} else if (current.right == prev) {
				stack.pop();
				System.out.print(current.value + " ");
			}
			prev = current;
		}
	}
}