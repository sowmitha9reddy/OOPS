package inhetiance;
class rect{
	final float PI=3.14f;
	void change() {
		//PI=908.0f;
		System.out.println(PI);
	}
}
class parent67{
	final void disp() {
		
	}
}
class child67 extends parent67{
	@Override
	void disp() {
		//final methods can be inherited but not overridden.
	}
}
final class Parent56{
	
}
class Child56 extends Parent56
{
	//Final class cannot be inherited
}
class thu56{
	 int i=9;
}
class sow extends thu56{
	int i=99;
	void disp() {
		System.out.println(super.i); //give preference to local variable.
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        rect r=new rect();
        r.change(); 
                         
	}

}
