package inhetiance;

class parent1231{
	parent1231(){
		System.out.println("inside parent");
		
	}
}
class child00 extends parent1231{
	child00(){
		//super(); if super method is not called in constructor .the java itself calls the super keyword.
		System.out.println("inside child");
	}
}
public class oustideconstructorchaining {
	public static void main(String[] args) {
		child00 c1=new child00();
	}

}
