package examplesofstatic;

import java.util.Scanner;

class farmer1{
	float p;
	float t;
	static float r;
	float si;
	
	{
		r=10;
	}
	void acceptinput()
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the principal amount:");
	p=scan.nextFloat();
	System.out.println("Enter the duration:");
	t=scan.nextFloat();
	scan.close();
	//calucate();
	
	}
	void calucate(){
		
		si=(p*r*t)/100;
		//printresult();
		
		
	}
	void printresult(){
		
		System.out.println("give the simple interset"+ si);
		
	}
}	
public class Adavantageofstaticvariableexampleinterest {
	
	public static void mian(String[] args) {
		System.out.println("hello world");
		 farmer1 f1=new farmer1();
		 f1.acceptinput();
		 f1.calucate();
		 f1.printresult();
		 farmer1 f2=new farmer1();
		 f2.acceptinput();
		 f2.calucate();
		 f2.printresult();
	     }
}
