package examplesofstatic;
class Demo49 {
	static {
		System.out.println("wont excetuted because class is not called if need object of class need to create");
	}
	void disp() {
		 int a; 
		// static int a; local vsriable can't give as static
}
}



public class adavantageofstaticblock {
	static int a;
	static {
		System.out.println("India");
		a=30;
		System.out.println(a);
	}
	static {
		System.out.println("china");
	}

       public static void mian(String[] args) {
    	   Demo49 d=new Demo49();
    	   System.out.println("pakistan");
    	   
       }
}
