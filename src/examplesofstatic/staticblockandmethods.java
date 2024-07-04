package examplesofstatic;
class demo12{
	static int a,b;// static variables can accessed by static blocks & static methods.
	int x,y;
	static {
		a=10;
		b=90;    // static block can access static variables.
		x=899;
		y=876;   //static blocks cannot access instance variables.
		
	}
	static void nm(){
		a=20;          // static methods can access static variables.
		b=900;
		x=90;
		y=70;       //static blocks cannot access instance variables.
	}
	{
		a=27;      //instance blocks can be access static variables
		b=14;
	
	}
	void dummy() {
		a=90;       //instance methods can access static varaibles.
		b=50;
	}
	demo12(){
		a=9000;
		b=6787;  // construtor can access both instance and static memeers.
		
		x=900;
		y=7888;
		
	}
}
public class staticblockandmethods {
public static void main(String[] args) {
	demo12 d=new demo12();
	
}
}
