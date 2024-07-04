package inhetiance;

/*class Parent09{
	void readBooks() {
		System.out.println("They will read books dialy");
	}
}
class Child09 extends Parent09{
	//@Override
	/*private void readBooks() {
		
	} */
	//1.whenever we are overriding the methods we can give the same access modifier or else we can 
	//increase the visibility but we should not decrease it.
	/*public void readBooks() {
		System.out.println("I will not read Books");
	}*/
	//2.We can't change the return type of primitive type of methods.
	/*readBooks() {
		
	} */

/*class Animal{
	
}
class Tiger extends Animal{
	
}
class parent7{
	Animal disp(){
		System.out.println("hi");
		Animal a1=new Animal();
		return a1;
	}
}
class Child9 extends parent7{
	//@Override
	/*Lion disp(){
		System.out.println("hello");
		Tiger t1=new Tiger();
		return t1;
		
	
	} */
	/*@Override
	Tiger  disp(){
		System.out.println("hello");
		Tiger t1=new Tiger();
		return t1;
		
	
	}
}
class Lion{
	
} */
class parent8{
	
     public	void disp() {
		System.out.println("sow");
	}
}
class child8 extends parent8{
	@Override
	public void disp(int a) {
	System.out.println("thum");
    }
}



public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child97.disp();

	}

}
