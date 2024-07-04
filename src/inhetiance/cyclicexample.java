package inhetiance;
class parent676 extends child123 // error is cyclic detected between parent and child.
{
	
}
class child123 extends parent676{
	
}

public class cyclicexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
