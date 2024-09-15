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
			addFirstPosition(element);
		}

		this.tail.next = node;
		this.tail = node;
		this.size++;
	}

	public void addByPosition(T element, int position) throws Exception {
		if (position < 0 || position > this.size) {
			throw new Exception("Posição inexistente!");
		}

		if (position == 0) {
			addFirstPosition(element);
			return;
		}

		if (position == this.size) {
			addLastPosition(element);
			return;
		}

		Node tempNode = head;

		for (int i = 0; i < position - 2; i++) {
			tempNode = tempNode.next;
		}

		Node node = new Node(element, tempNode.next);

		tempNode.next = node;

		this.size++;
	}

	public void removeFirstPosition() throws Exception {
		if (size > 0) {
			Node node = this.head;
	
			this.head = node.next;
			node = null;
	
			this.size--;
		} else {
			throw new Exception("Lista vazia!");
		}
	}

	public Node getNodeByPosition(int position) {
		Node temp = this.head;

		for (int i = 0; i < position; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void removeLastPosition() throws Exception {
		if (this.size > 0) {
			Node node = this.getNodeByPosition(this.size - 2);
			System.out.println(node.node);
	
			this.tail = node;
			node.next = null;
	
			this.size--;
		} else {
			throw new Exception("Lista vazia!");
		}
	}

	public void removeElement(int position) throws Exception {
		if (this.size > 0 && (position > -1 || position <= this.size)) {
			if (position == 0) {
				removeFirstPosition();
				return;
			}

			if (position == this.size) {
				removeLastPosition();
				return;
			}

			Node node = getNodeByPosition(position - 2);

			System.out.println(node.node);

			node.next = node.next.next;
			this.size--;
			

		} else {
			throw new Exception("Lista vazia!");
		}
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
