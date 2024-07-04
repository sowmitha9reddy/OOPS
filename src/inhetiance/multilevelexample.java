package inhetiance;

import inhetiance.child98.parent7;

class grandparent{
	float height=6.7f;
	void exercise() {
		System.out.println("i will do yoga dialy");
	}
	
}
class parent1 extends grandparent
{
	
}
class child1 extends parent1{
	
}

public class multilevelexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c1=new child1();
		System.out.println(c1.height);
		c1.exercise();
		

	}

}
