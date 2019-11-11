package com.Class17;

public class ObjectOfCarClass {
public static void main(String[] args) {
	
	Car car1= new Car();
	car1.make="Tesla";
	car1.model="S";
	car1.color="Black";
	car1.wheels=4;
	car1.windows=5;
	car1.year=2020;
	//accessing behavior for first object
	car1.start();//calling method from Class Car
	car1.accelerate();
	car1.drive();
	
	System.out.println("I drive a "+car1.color+" "+car1.make);
	
	Car car2= new Car();
	car2.make="BMW";
	car2.model="i8";
	car2.color="Grey";
	car2.wheels=4;
	car2.windows=6;
	car2.year=2019;
	//accessing behavior for second object
	car2.start();
	car2.accelerate();
	car2.drive();
	
	System.out.println("I drive a "+car2.year+" "+car2.make);
	
}
}
