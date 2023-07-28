package com.java.jse;

import java.util.LinkedList;
import java.util.Queue;

public class JavaEx05 {
	
	public static void main(String[] args) {
		
		// FIFO(First In First Out) : 선입선출
		Queue<String> qu = new LinkedList<>();
		
		qu.offer("java");
		qu.offer("c");
		qu.offer("python");
		
		System.out.println(qu.size()); // 3
		
		System.out.println(qu.poll()); // java
		System.out.println(qu.size()); // 2
		
		System.out.println(qu.poll()); // c
		System.out.println(qu.size()); // 1
		
		System.out.println(qu.poll()); // python
		System.out.println(qu.size()); // 0
		
	}

}
