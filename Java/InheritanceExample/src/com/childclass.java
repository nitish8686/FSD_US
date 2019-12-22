package com;

public class childclass extends ParentClass {

	public void add(int a, int b)
	{
		System.out.println("add method of childclass"+(a+b));
	}
	public static void main(String[] args) {
		
	 childclass e = new childclass();
/*	 e.add(10, 20);
	 e.display();*/
	 e.gpshow();
	 ParentClass p = new ParentClass();
	 p.add(10,50);

	}
	
}
