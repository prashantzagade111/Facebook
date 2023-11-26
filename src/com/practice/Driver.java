package com.practice;

public class Driver {
	public static void main(String[]args)
	{
		laptop l1=new laptop("HP",50000.00,8,256,"Intel i7","Windows 11");
		l1.displaylaptop();
		l1.insertpendrive("Sandisk",128,2000.00,"red",1,"3.2");
		l1.p.displaypendrive();
		
	}

}
