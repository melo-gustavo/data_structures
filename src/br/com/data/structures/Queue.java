package br.com.data.structures;

public class Queue<T> {
	private T[] elements;
	private Integer sizeQueue = 0;

	@SuppressWarnings("unchecked")
	public Queue(int capacity) {
		this.elements = (T[]) new Object[capacity];
	}

	public int sizeElements() {
		return this.sizeQueue;
	}

	public void addElement(T element) throws Exception {
		if (this.sizeQueue == this.elements.length) {
			throw new Exception("Fila cheia!");
		}

		for (int i = 0; i < this.elements.length; i++) {
			if (this.elements[i] == null) {
				this.elements[i] = element;
				this.sizeQueue++;
				break;
			}
		}
	}

	public void removeElement() throws Exception {
		if (this.sizeQueue == 0) {
			throw new Exception("Fila vazia!");
		}

		for (int i = 0; i < this.elements.length - 1; i++) {
			this.elements[i] = this.elements[i + 1];
		}
		
		this.elements[this.sizeQueue - 1] = null;
		
		this.sizeQueue--;
	}
	
	public void printQueue() {
		if (this.sizeQueue == 0) {
			System.out.println("Fila vazia!");
		}
		
		for (int i = 0; i < this.elements.length; i++) {
			System.out.println(this.elements[i]);
		}
	}
}
