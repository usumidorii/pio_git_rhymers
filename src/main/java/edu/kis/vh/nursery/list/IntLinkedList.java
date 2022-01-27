package edu.kis.vh.nursery.list;

class IntLinkedList {

	private static final int EMPTY = -1;
	private Node last;
	private int i;

	/**
	 * Adds new element to the list
	 * @param i value of new element
	 */

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * checks if the list is empty
	 * @return 'true' if list is empty
	 */

	private boolean isEmpty() {
		return last == null;
	}

	/**
	 * checks if the list is full
	 * @return always returns false
	 */

	//todo method can be deleted

	public boolean isFull() {
		return false;
	}

	/**
	 * returns value of the last element
	 * @return '-1' if list is empty or value of the last element
	 */

	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	/**
	 * takes off the last element form the list
	 * @return value of the last element
	 */

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getI() {
		return i;
	}

	private static class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
