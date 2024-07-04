package javabasic;
class bank1{
	private int accnum;
	private int passwd;
	// It is a specialized setter in java.the constructor name should be  same as class name and without any written type.
	bank1 (int accnum, int passwd) { 
		this.accnum=accnum;
		this.passwd=passwd;
		
		
	}
	public int getaccnum() {
		return accnum;
	}
	public int getpasswd() {
		return passwd;
	}
}

public class localchaining {
	public static void main(String[] args) {
		bank1 b1=new bank1(89485,950);
		System.out.println(b1.getaccnum());
		System.out.println(b1.getpasswd());
	}

}
