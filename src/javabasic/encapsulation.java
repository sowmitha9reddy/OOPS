package javabasic;

class bank { 
	 private int an;
	 private int ps;
	 // we need to follow convention for that purpose we this keyword for passing data to instance variable using local variable
	 public void setAn(int an) {
			this.an = an;
		}
	 public int getAn() {
		return an;
	}
	 public void setPs(int ps) {
			this.ps = ps;
		}
		
	public int getPs() {
		return ps;
	}
	
	
}
public class encapsulation {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		bank b1=new bank();
		b1.setAn(78990);
		b1.setPs(3597);
		System.out.println(b1.getAn());
		System.out.println(b1.getPs());
		
		

	}
}
