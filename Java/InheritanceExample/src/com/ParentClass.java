package com;

public class ParentClass extends grandparentclass{

	public void add(int a, int b)
	{
		System.out.println("Inside the parent class add method");
		System.out.println("Sum of 2 numbers is "+(a+b));
	}
	
	public void display()
	{
		System.out.println("Display method of parent class");
	}
}
