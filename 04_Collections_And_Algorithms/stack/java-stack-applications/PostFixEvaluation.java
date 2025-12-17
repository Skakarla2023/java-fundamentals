package javaprograms;

import java.util.*;

class PostFixEvaluation {
	static int postfix(String str) {
		int n = str.length();
		String[] tokens = new String[n];
		for (int i = 0; i < n; i++) {
			tokens[i] = String.valueOf(str.charAt(i));
		}
		Stack<Integer> stack = new Stack<>();
		for (String s : tokens) {
			if (!(s.equals("*") || s.equals("+") || s.equals("-") || s.equals("/") || s.equals("%") || s.equals("^"))) {
				stack.push(Integer.parseInt(s));
			} else {
				int a = stack.pop();
				int b = stack.pop();
				switch (s) {
				case "*":
					stack.push(b * a);
					break;
				case "+":
					stack.push(b + a);
					break;
				case "-":
					stack.push(b - a);
					break;
				case "/":
					stack.push(b / a);
					break;
				case "%":
					stack.push(b % a);
					break;
				case "^":
					stack.push((int) Math.pow(b, a));
					break;
				}
			}
		}
		return stack.peek();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postfix expression:");
		String str = sc.nextLine();
		int res = postfix(str);
		System.out.println(res);
	}
}
