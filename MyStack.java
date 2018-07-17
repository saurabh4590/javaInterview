package codePractice.algorithm.DS;

import java.util.Arrays;

public class MyStack {

	private int myStackSize;
	private int[] myStack;
	private int top;

	public MyStack(int size) {
		this.myStackSize = size;
		this.myStack = new int[myStackSize];
		this.top = -1;
	}

	public int pull() throws Exception {
		if (top == -1) {
			throw new Exception();
		} else {
			myStack[top] = 0;
			int i = this.myStack[top--];
			return i;
		}
	}

	public void push(int entry) throws Exception {
		if (top == (myStackSize - 1)) {
			throw new Exception();
		} else {
			myStack[++top] = entry;
		}
	}

	@Override
	public String toString() {
		return "MyStack [myStackSize=" + myStackSize + ", myStack=" + Arrays.toString(myStack) + ", top=" + top + "]";
	}

	public static void main(String[] args) throws Exception {
		MyStack myStack = new MyStack(3);
		myStack.push(10); // MyStack [myStackSize=3, myStack=[10, 0, 0], top=0]
		System.out.println(myStack.toString());
		myStack.pull(); // MyStack [myStackSize=3, myStack=[0, 0, 0], top=-1]
		System.out.println(myStack.toString());
		myStack.push(20); // MyStack [myStackSize=3, myStack=[20, 0, 0], top=0]
		System.out.println(myStack.toString());
		myStack.push(30); // MyStack [myStackSize=3, myStack=[20, 30, 0], top=1]
		System.out.println(myStack.toString());
		myStack.pull(); // MyStack [myStackSize=3, myStack=[20, 0, 0], top=0]
		System.out.println(myStack.toString());

	}

}
