package com.Class17;
public class Phone {

String make, model, color, memory;

	void camera() {
		System.out.println(make+" "+model+" has a good camera");
	}
	void call(){
		System.out.println(make+" "+model+" can make phone calls");
	}
	void text() {
		System.out.println(make+" "+model+" can send texts");
	}
	
	public static void main(String[]args) {
		Phone p1=new Phone();
		p1.make="Samsung";
		p1.model="Galaxy S10";
		p1.color="Black";
		p1.memory="64gb";
		
		p1.text();
		p1.call();
		p1.camera();
		
		System.out.println();
		
		Phone p2=new Phone();
		p2.make="Apple";
		p2.model="Iphone X";
		p2.color="White";
		p1.memory="32gb";
		
		p2.text();
		p2.call();
		p2.camera();
		
		System.out.println();
		
		Phone p3=new Phone();
		p3.make="Nokia";
		p3.model="Xpress Music";
		p3.color="Grey";
		p3.memory="16gb";
		
		p3.text();
		p3.call();
		p3.camera();
		
	}
}
