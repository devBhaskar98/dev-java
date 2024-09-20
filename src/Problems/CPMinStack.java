package Problems;

import java.util.Stack;

class MinStack {
	// Create a stack data structure
	Stack<Integer> stack;
	// Create a variable to keep track of the minimum value
	int min;

	public MinStack() {
		stack = new Stack<Integer>();
	}

	public void push(int x) {
		// If the stack is empty, set the min to the pushed value
		if (stack.isEmpty()) {
			min = x;
		}
		// If the pushed value is less than the current min, set the min to the pushed
		// value
		else if (x < min) {
			min = x;
		}
		// Push the value onto the stack
		stack.push(x);
	}

	public void pop() {
		// If the stack is empty, do nothing
		if (stack.isEmpty()) {
			return;
		}
		// Get the top value on the stack
		int top = stack.pop();
		// If the top value is the same as the current min, pop the min value off the
		// stack
		if (top == min) {
			min = stack.pop();
		}
	}

	public int top() {
		// If the stack is empty, return -1
		if (stack.isEmpty()) {
			return -1;
		}
		// Return the top value on the stack
		return stack.peek();
	}

	public int getMin() {
		// If the stack is empty, return -1
		if (stack.isEmpty()) {
			return -1;
		}
		// Return the current min value
		return min;
	}
}

public class CPMinStack {

	public static void main(String[] args) {
		MinStack myStack = new MinStack();

		myStack.push(10);

		myStack.push(30);
		myStack.push(20);
		myStack.push(5);

		for (Integer item : myStack.stack) {
			System.out.println("item" + item);
		}

		System.out.println("Min value of MyStack" + myStack.getMin());
	}

}
