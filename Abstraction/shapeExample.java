package Abstraction;

import java.util.Scanner;

abstract class shape{
	Scanner scan=new Scanner(System.in);
	float area;
	abstract void acceptInput();
	abstract void  calcArea();
	abstract void dispArea();
	
	
	
}
class Rectangle extends shape{
	float length;
	float breadth;
	@Override
	void acceptInput() {
		System.out.println("Enter the length of rectangle:");
		length=scan.nextFloat();
		System.out.println("Enter the breadth of rectangle:");
		breadth =scan.nextFloat();
	}
	@Override
	void calcArea() {
		area=length*breadth;
		
	}
	@Override
	void dispArea() {
	      System.out.println("display the area of rectangle:");
		
	}
public class shapeExample {

}
