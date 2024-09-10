package main;

import br.com.data.structures.Stack;

public class MainStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>(3);

		stack.push("Gustavo");
		stack.push("Emilly");
//		stack.push("Kedma");

		stack.printHeap();

		System.out.println(stack.peek());
		System.out.println(stack.search("Emilly"));
		System.out.println(stack.size());

		stack.pop();

		stack.printHeap();
	}
}
