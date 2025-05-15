package com.example.practice;

public class PracticeApplication {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println("Value - " + p.a);
	}

}

class Parent {
	int a = 10;
}

class Child extends Parent {
	int a = 20;
}

