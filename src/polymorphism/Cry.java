package polymorphism;
class Parent001{
	void cry() {
		System.out.println("parent nve cry")
	}
}
class child4 extends Parent001
{
	@Override
	void cry() {
		System.out.println( "child5 cry in low voice");
	}
	void code() {
		System.out.println("i know python");
	}
	
}
class child5  extends Parent001
{
	@Override
	void cry() {
		System.out.println("child6 cry in medium ");
	}
	void code() {
		System.out.println("i know c");
	}
}
class child6 extends Parent001{
	@Override
	void cry() {
		System.out.println("child7 will cry");
	}
	void code() {
		System.out.println("i know java");
	}
}
class human{
	void permit(Parent001 ref) {
		ref.cry();
		 ((child6)(ref)).code();
		
	}
}
public class Cry {
 public static void main(String[] args) {
	
	 /*child4 c1=new child4();
	 child5 c2=new child5();
	 child6 c3=new child6();
	 c1.cry();
	 c2.cry();
	 c3.cry(); // 3:3 no polymorphism
	 Parent001 ref;
	 child4 c5=new child4();
	 child5 c6=new child5();
	 child6 c7=new child6();
	 ref=c5;
	 ref.cry();
	 ref.Code();// specialized cannot be directly accessed for that
	 
	 ref=c6;
	 ref.cry();
	 ((child6)(ref)).code(); // we to tell the reference instead of behaving like parent behave like child .
	 //This process is called  downcasting.
	 
	 
	 ref=c7;
	 ref.cry(); //1:M polympophism archieved;
	 */
	 child4 c5=new child4();
	 child5 c6=new child5();
	 child6 c7=new child6();
	 human h1=new human();
	 h1.permit(c5);
	 h1.permit(c7);
	 h1.permit(c6);
	
	  
	 
	 
	 
	 
 }
}
