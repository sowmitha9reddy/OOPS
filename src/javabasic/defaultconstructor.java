package javabasic;

class cons{
	String name;
	float cost;
	//if no construtor is given by user the default constructor is given by "java complier" i.e a zero paramterized contructor.
	cons(){
		System.out.println("zero paramterized");
	}
	
}
public class defaultconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     cons c=new cons();
     System.out.print(c.name);
     System.out.print(c.cost);
	}

}
