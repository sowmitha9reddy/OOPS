package inhetiance;
class grandparent11{
	grandparent11(){
		System.out.println("inside");
	}
	grandparent11(int a){
		//this();
		System.out.println("outside");
	}
}
class parent000 extends grandparent11{
	parent000(){
		//super(30);
		System.out.println("beside");
	}
	parent000(int a){
		//this();
		System.out.println("in");
		
	}
}
class child000 extends parent000{
	child000(){
		//super(10);
		System.out.println("on");
	}
	child000(int a){
		//super(30);
		this();
		System.out.println("up");
	}
	
}
public class constructorchainingoverloading {
 public static void main(String[] args) {
	 child000 c1=new child000(100);
 }
}
