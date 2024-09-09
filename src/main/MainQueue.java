package main;

import br.com.data.structures.Queue;

public class MainQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new Queue<Integer>(3);
		
		queue.addElement(10);
		queue.addElement(100);
		queue.addElement(20);
		
		queue.printQueue();
		
		queue.removeElement();
		queue.removeElement();
		
		System.out.println("--------------------");
		
		queue.printQueue();
		queue.removeElement();
		
		System.out.println("--------------------");
		
		System.out.println(queue.sizeElements());
	}
}
