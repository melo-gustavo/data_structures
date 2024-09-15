package br.com.data.structures;

public class SimpleList<T> {
	
	private Node head;
	private Node tail;
	private Integer size;
	
	public SimpleList() {
		this.size = 0;
	}
	
	public void addFirstPosition(T element) {
		Node node = new Node(element);
		
		node.next = this.head;
		this.head = node;
		
		if (this.tail == null) {
			this.tail = this.head;
		}
		
		this.size++;
	}

	public void addLastPosition(T element) {
		Node node = new Node(element);
	
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}
	
		this.tail = node;
		this.size++;
	}

	public void sizeNodes() {
		System.out.println("Quantidade de nodes igual: " + this.size);
	}
	
	public void printNodes() {
		Node temp = this.head;
		
		System.out.print("***HEAD***" + " -> ");
		while (temp != null) {
			System.out.print(temp.node + " -> ");
			temp = temp.next;
		}
		System.out.println("***TAIL***");
	}
	
	private class Node {
		private T node;
		private Node next;
		
		public Node(T element) {
			this.node = element;
		}
		
		public Node(T element, Node next) {
			this.node = element;
			this.next = next;
		}
	}
}
