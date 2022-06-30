package com.test;

public class Application {
	public static void main(String[] args) {
		
		//Object creation
		/*Calculator cal = new Calculator();
		cal.sum(2, 3);*/
		
		//Lambda expression with data types
		//ICalculator ical = (int a, int b)-> System.out.println("a + b =" + (a + b));
		
		//Lambda expression without  data types
		//ICalculator ical = (a,  b)-> System.out.println("a + b =" + (a + b));
		
		//Lambda expression with return type
		ICalculator ical = (a,  b)->  (a + b);
		System.out.println("a + b =" + ical.sum(2, 4));
		
		//using inheritance also it works
		IScientificCalculator scientificCalculator = (a,  b)->  (a + b);
		
	}
}
