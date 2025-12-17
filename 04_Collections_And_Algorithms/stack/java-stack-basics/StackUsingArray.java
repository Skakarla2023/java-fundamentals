package javaprograms;

public class StackUsingArray {
	int[] arr;
	int size;
	int top;

	public StackUsingArray(int size) {
		top = -1;
		this.size = size;
		arr = new int[size];
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Stack is: ");
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = data;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		top--;
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Peek element:" + arr[top]);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size;
	}

	public static void main(String[] args) {
		StackUsingArray st = new StackUsingArray(10);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		st.display();
		System.out.println("Is stack empty? " + st.isEmpty());
		System.out.println("Is stack full? " + st.isFull());

		st.pop();

		st.peek();
		st.display();
	}

}
