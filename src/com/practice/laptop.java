package com.practice;

public class laptop {
	
	String brand;
    double price;
	int ram;
	int rom;
	String proccessor;
	String os;
	pendrive p;
	
	public laptop()
	{
		
	}	
	
	laptop(String brand,double price,int ram,int rom,String proccessor,String os)
	{
		this.brand=brand;
		this.price=price;
		this.os=os;
		this.proccessor=proccessor;
		this.ram=ram;
		this.rom=rom;
		System.out.println("Laptop Insested!");
	}
	public void insertpendrive(String brand,int storage,double price,String color,double speed,String type)
	{
		p=new pendrive(brand,storage,price,color,speed,type);
				
		System.out.println("Pendrive Insested!");
	}
	public void displaylaptop()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Proccessor:"+proccessor);
		System.out.println("Os:"+os);
		System.out.println("Ram:"+ram);
		System.out.println("Rom:"+rom);
	}
}
