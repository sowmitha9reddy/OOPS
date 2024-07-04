package javabasic;

class bank3{
	private int accNo;
	private int paaswd;
	bank3(int accNo,int paaswd){
		this();
		//this with braces is method calling one construtor to another constructor
		
		// this is a keyword
		this.accNo=accNo;
		this.paaswd=paaswd;
		
	}
	
	bank3() {
		System.out.println("Inside-zero paramterized");
	}
	public int getaccNo() {
		return accNo;
	}
	public int getpaaswd() {
		return paaswd;
	}
	
}
public class bankexample {
  public static void main(String[] args) {
	  bank3 b1=new bank3(9898,898);
	  System.out.println(b1.getaccNo());
	  System.out.println(b1.getpaaswd());
	  
	  
  }
}
