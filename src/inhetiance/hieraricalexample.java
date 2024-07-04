package inhetiance;
class parent11{
	String color="white";
	void drinkMilk() {
		System.out.println("I dirnk a glass of milk everyday");
	}
	
}
class child11 extends parent11{
	void h2(){
	System.out.println("i am aadhya.");
	}
}
class child22 extends parent11{
	void h2(){
		System.out.println("i am mourya.");
		}
	
}
class child33 extends parent11{
	void h2(){
		System.out.println("i am  charvi.");
		}
	
}

public class hieraricalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child11 c1=new child11();
		child22 c2=new child22();
		child33 c3=new child33();
		c1.h2();
		System.out.println(c1.color);
		c1.drinkMilk();
		c2.h2();
		System.out.println(c2.color);
		c2.drinkMilk();
		c3.h2();
		System.out.println(c3.color);
		c3.drinkMilk();
		
		

	}

}
