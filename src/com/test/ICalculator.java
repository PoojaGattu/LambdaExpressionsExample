package com.test;

//interface with one abstract method == functional interface
@FunctionalInterface
public interface ICalculator {
	
	//returns nothing 
     //public void sum(int a, int b);
   
	//returns int 
   public int sum(int a, int b);
   
   /*If we write another method in interface compile error will be thrown bcoz 
   functional interface has only one abstract method to implement lambda expression*/
   //public int sub(int a, int b);
}
