package javabasic;
class dog{
	private String name;
	private int age;
	private float cost;
	/*dog(String name,int age,float cost){
		this(14);
		this.name=name;
	//this.age=age;
		this.cost=cost;
	} */
	dog(String name){
		this();
		this.name=name;
	}
	dog(int age){
		
		//this();
		//this("mary");
		this.age=age;
		
		this.cost=15000;
	}
	dog(){
		this(2);
		System.out.println("Excetuing zero paramterized constructor");
	}
	void setName(String name) {
		//this();-->Error  constructor call should be the first statement in constructor only.
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getCost() {
		return cost;
		
}
}


public class localchainingexampledog {
	public static void main(String[] args) {
		//dog d1=new dog("babby",4,10000);
		dog d1=new dog("maxy");
		System.out.println(d1.getname());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
		
		
	}
}
