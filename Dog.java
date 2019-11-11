package com.Class17;
public class Dog {
	
	String breed, height;
	int age;
	
	void barking () {
		System.out.println(breed+" knows how to bark");
	}
	void eating() {
		System.out.println(breed+" loves to eat");
	}
	void napping(){
		System.out.println(breed+" loves to nap");
	}
	
	public static void main(String [] args) {
		
		Dog d1=new Dog();
		d1.breed="Husky";
		d1.height="Tall";
		d1.age=5;
		
		d1.eating();
		d1.napping();
		d1.barking();
		
		System.out.println();
		
		Dog d2=new Dog();
		d2.breed="Bulldog";
		d2.height="SHort";
		d2.age=2;
		
		d2.eating();
		d2.napping();
		d2.barking();
		
		System.out.println();
		
		Dog d3=new Dog();
		d3.breed="Labrador";
		d3.height="Medium";
		d3.age=12;
		
		d3.eating();
		d3.napping();
		d3.barking();
		
	}	
}
