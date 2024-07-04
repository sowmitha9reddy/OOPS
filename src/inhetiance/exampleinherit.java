package inhetiance;

class parent{
	String skincolor="brown";
	void nosmoke() {
		System.out.println("i will not smoke");
	}
	
}
class child extends parent{
	
}
public class exampleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sudha");
		child c1=new child();
		
		System.out.println(c1.skincolor);
		c1.nosmoke();
		

	}
 
}
