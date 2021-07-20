package stack01;

import java.util.*;

public class Stack01 {

	static int top = -1;
	Scanner sc = new Scanner(System.in);

	public void push(int stack[], int size) {
		if (top == size) {
			System.out.println("Stack overflow.");
		} else {
			top++;
			System.out.println("Enter info :");
			stack[top] = sc.nextInt();
		}
	}

	public void pop(int stack[]) {
		if (top == -1) {
			System.out.println("Stack underflow");
		} else {
			top--;
			stack[top] = 0;
			System.out.println("Top element has been deleted .");
		}
	}

	public void display(int stack[]) {
		int a = top;
		
		for (int i = 0; i < top + 1; i++) {
			System.out.println((i+1) + "." + stack[i]);
			
		}
		top = a;
	}

	public static void main(String[] args) {

		Stack01 obj = new Stack01();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack:");
		int size = sc.nextInt();

		int stack[] = new int[size];
		int x = 0;
		do {
			System.out.println("<<<<<<<<<<Menu>>>>>>>>>>");
			System.out.println("1.push.");
			System.out.println("2.pop");
			System.out.println("3.display");
			int y = sc.nextInt();
			switch (y) {
			case 1:
				obj.push(stack, size);
				break;
			case 2:
				obj.pop(stack);
				break;
			case 3:
				obj.display(stack);
				break;
			default:
				System.out.println("wrong input .");

			}

			System.out.println("Do you want to continue ? in not press 0.");
			x = sc.nextInt();
		} while (x != 0);
	}

}
