package inhetiance;
class grandParent33{
	String color="black";
	void execrise() {
		System.out.println("i will do yoga daily");
	}
	
}
class parent00 extends grandParent33{
	
}
class child21 extends parent00{
	
}
class child245 extends parent00{
	
}
class child23 extends parent00{
	
}
public class hybridexample {
	public static void main(String[] args) {
		child21 c1=new child21();
		child245 c2=new child245();
		child23 c3=new child23();
		System.out.println(c1.color);
		c1.execrise();
		System.out.println();
		System.out.println(c2.color);
		c2.execrise();
		System.out.println(c2.getClass());
		c2.equals(c3);
		System.out.println(c2.hashCode());
		System.out.println();
		System.out.println(c3.color);
		c3.execrise();
		
		
		
	}

}
