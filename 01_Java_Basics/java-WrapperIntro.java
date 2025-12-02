package javaprograms;

public class WrapperIntro {
	public static void main(String[] args) {
		
		// Autoboxing : Primitive to Wrapper
		int x = 10;
		Integer y = x;
		System.out.println("Value of x is:"+x);
		System.out.println("Value of y is:"+y);
		
		// Unboxing : Wrapper to Primitive
		Integer a = Integer.valueOf(x);
		System.out.println("Value of a:"+a);
	}
}
