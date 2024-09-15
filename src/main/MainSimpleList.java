package main;

// import java.util.LinkedList;
import br.com.data.structures.SimpleList;

public class MainSimpleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedList ll = new LinkedList();

		SimpleList<Integer> list = new SimpleList<Integer>();

		list.addFirstPosition(10);
		list.addFirstPosition(11);
		list.addFirstPosition(12);
		list.addFirstPosition(13);
		list.addLastPosition(20);
		list.addLastPosition(21);

		list.printNodes();

		list.sizeNodes();
	}


}
