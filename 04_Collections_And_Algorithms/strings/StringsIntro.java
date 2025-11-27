package javaprograms;

import java.util.*;

public class StringsIntro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = new String("Hello");
		
		StringBuilder str1 =  new StringBuilder("Hello");
		
		str1.append(1234);
		
		System.out.println(str1);
		System.out.println(str1.substring(1,4));
		System.out.println(str1.equals("Hello World"));
		
		System.out.println(str1.length());
		
	}

}
