package com.java.jse;

import java.util.Stack;

public class JavaEx06 {

	public static void main(String[] args) {

		// LIFO(Last In First Out) : 후입선출
		Stack<String> st = new Stack<>();
		
		st.push("java");
		st.push("c");
		st.push("python");
		
		System.out.println(st.pop()+", "+st.size()); // python, 2
		System.out.println(st.pop()+", "+st.size()); // c, 1
		System.out.println(st.pop()+", "+st.size()); // java, 0

	}

}

