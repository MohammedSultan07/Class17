package com.Class17;
public class ObjectOfComputerClass {
public static void main(String[] args) {
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
	
	//////only code inside main method gets executed
}
}
