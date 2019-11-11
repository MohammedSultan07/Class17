package com.Class17;

public class Computer {
	String keyboard, mouse, brand, name;
	int screen, memory;
	
	
	void playGames() {//method header
		System.out.println("I can play on my "+name);//method body
	}
	void javaCode() {
		System.out.println("I can do Java coding on my "+name);
	}
	void watchMovie() {
		System.out.println("I can watch a movie on my "+name);
	}
	public static void main(String []args) {
		
		Computer computer1=new Computer();
		computer1.brand="Apple";
		computer1.name="Macbook";
		computer1.keyboard="true";
		computer1.mouse="built in";
		computer1.screen=15;
		computer1.memory=250;
		System.out.println("I use a "+computer1.brand+" "+computer1.name+" with a "+computer1.screen+" inch screen");
		computer1.javaCode();
		computer1.playGames();
		computer1.watchMovie();
		
		System.out.println();
		System.out.println("****Creating a second object of a computer type****");
		System.out.println();
		
		Computer computer2=new Computer();
		computer2.brand="Dell";
		computer2.name="420";
		computer2.memory=125;
		computer2.javaCode();
		computer2.playGames();
		computer2.watchMovie();
		
	}
}
