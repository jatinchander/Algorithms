package dataStructures;

import java.util.LinkedList;

public class MyQueue {
	private int size;
	private final LinkedList<Integer> myQueue;

	public MyQueue() {
		myQueue = new LinkedList<>();
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int deQueue() {
		if (this.isEmpty()) {
			throw new NullPointerException("QUEUE IS EMPTY");
		} else {
			size--;
			return myQueue.removeFirst();
		}
	}

	public void enQueue(int data) {
		myQueue.addLast(data);
		size++;
	}

	public int peek() {
		return myQueue.getFirst();
	}
}
