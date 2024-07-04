package javabasic;

 class Bank{ 
	 private int an;
	 private int ps;
	// we need to follow convention for that purpose we this keyword for passing data to instance variable using local variable
	 // when an=an or ps= ps then shadowing problem will occur to avoid that this keyword is used.
	 // we need to follow camelCase convention for writing funcion names and variables. names.
	 
	 public void setter(int an,int ps) {
		 this.an=an;
		 this.ps=ps;
	 }
	 //if we like to give 2 (separate setters) setters also we can give it.
	 public int ac() {
		 return an;
	 }
	 public int ps() {
		 return ps;
	 }
 }
public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.setter(123456789,9090);
		//System.out.println(b1.getter1());
		//System.out.println(b1.getter2());
		System.out.println(b1.ac());
		System.out.println(b1.ps());
		
		

	}

}
