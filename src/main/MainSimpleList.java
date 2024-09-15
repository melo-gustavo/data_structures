package main;

import br.com.data.structures.SimpleList;

public class MainSimpleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedList ll = new LinkedList();

		SimpleList<Integer> list = new SimpleList<Integer>();

		try {
			list.addFirstPosition(10);
			list.addFirstPosition(11);
			list.addFirstPosition(12);
			list.addFirstPosition(13);
			list.addLastPosition(20);
			list.addLastPosition(21);
			list.addByPosition(30, 3);
			list.removeFirstPosition();
			list.removeLastPosition();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		list.printNodes();

		list.sizeNodes();

		try {
			list.removeElement(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		list.printNodes();
	}


}
