public class StackArr {
	int size;
	int arr[];
	int top;

	StackArr(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is Empty");
			System.out.println("");
			return -1;
		}
	}

	public int peek() {
		if (!this.isEmpty())
			return arr[top];
		{
			System.out.println("Stack is Empty");
			System.out.println("");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		StackArr sa = new StackArr(10);
		sa.pop();
		System.out.println("**Pushed elements**");
		System.out.println("");
		sa.push(24);
		sa.push(18);
		sa.push(02);
		sa.push(15);
		System.out.println("");
		System.out.println("**Popped elements**");
		System.out.println("");
		sa.pop();
		sa.pop();
		sa.pop();

	}

}