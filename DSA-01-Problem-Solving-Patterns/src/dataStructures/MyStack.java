package dataStructures;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	private int size;
	private final ArrayList<Integer> myStack;

	public MyStack() {
		myStack = new ArrayList<>();
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int pop() {
		if (this.isEmpty()) {
			throw new NullPointerException("STACK IS EMPTY");
		} else {
			size--;
			return myStack.remove(myStack.size() - 1);
		}
	}

	public void push(int data) {
		myStack.add(data);
		size++;
	}

	public int peek() {
		if (this.isEmpty()) {
			throw new NullPointerException("STACK IS EMPTY");
		} else {
			return myStack.get(size - 1);
		}
	}

}
