package com.javastury.jse;

public class CatName {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		
		cat.name = "day";
		cat.age = 3;
		
		System.out.println(cat.catInfo(cat.name, cat.age));
	}

}


