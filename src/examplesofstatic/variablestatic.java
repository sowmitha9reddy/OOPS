package examplesofstatic;

class demo{
	static int a;
	static int b;
	static 
	{
		a=10;
		b=20;
		System.out.println("inside static block");	
		
	}
	static void fun1(){
		System.out.println("static block");
		
	}
	int x;
	int y;
	
	{
	  System.out.println(x);
	  System.out.println(y);
	}
	void fun2(){
		System.out.println("instance method");
	}
	demo(){
        System.out.println("constructor");
        x=30;
        y=90;
 
		
	}
}
public class variablestatic {
	public static void main(String[] args) {
		
		demo.fun1();
		demo d=new demo();
		d.fun2();
	}

}
