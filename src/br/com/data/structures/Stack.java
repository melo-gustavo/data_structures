package br.com.data.structures;

public class Stack<T> {
	private T[] elements;
	private Integer sizeStack = 0;
	private Integer maxCapacity = 0;

	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		this.elements = (T[]) new Object[capacity];
		this.maxCapacity = capacity;
	}

	public boolean isEmpty() {
		if (this.sizeStack == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(T element) throws Exception {
		if (this.sizeStack == this.maxCapacity) {
			throw new Exception("Pilha cheia!");
		}

		for (int i = 0; i < this.elements.length; i++) {
			if (this.elements[i] == null) {
				this.elements[i] = element;
				this.sizeStack++;
				break;
			}
		}
	}

	public void pop() throws Exception {
		if (this.sizeStack == 0) {
			throw new Exception("Pilha vazia!");
		}

		this.elements[sizeStack - 1] = null;
	}

	public T peek() throws Exception {
		if (this.sizeStack == 0) {
			throw new Exception("Pilha vazia!");
		}
		return this.elements[this.sizeStack - 1];
	}

	public int search(T element) {
		if (this.sizeStack == 0) {
			return -1;
		} else {
			int position = -1;
			for (int i = 0; i < this.elements.length; i++) {
				if (this.elements[i] == element) {
					position = i + 1;
					break;
				}
			}
			return position;
		}

	}
	
	public int size() {
		return this.sizeStack;
	}

	public void printHeap() {
		if (this.sizeStack == 0) {
			System.out.println("Fila vazia!");
		}

		for (int i = 0; i < this.elements.length; i++) {
			System.out.println(this.elements[i]);
		}
	}
}
