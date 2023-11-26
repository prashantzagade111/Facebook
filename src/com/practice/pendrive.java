package com.practice;

public class pendrive {

	String brand;
	int storage;
	double price;
	String color;
	double speed;
	String type;
	
	public pendrive() {
		
	}
	pendrive(String brand,int storage,double price,String color,double speed,String type)
	{
		this.brand=brand;
		this.storage=storage;
		this.price=price;
		this.color=color;
		this.speed=speed;
		this.type=type;
		System.out.println("PenDrive create !");
	}
	public void displaypendrive()
	{
		System.out.println("Brend:"+brand);
		System.out.println("Storage:"+storage);
		System.out.println("Price:"+price);
		System.out.println("Color:"+color);
		System.out.println("Speed:"+speed);
		System.out.println("Type:"+type);
	}

}
	
		

	


