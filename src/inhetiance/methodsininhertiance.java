package inhetiance;
//camelCaseCovention-methods&variables
//pascal-class
//snake-uppercaseconventions-constants
class plane{
	void takeoff(){
		System.out.println("plane takeoffed");
	}
	void fly() {
		System.out.println("plane files");
		
	}
	void land() {
		System.out.println("plane landed");
	}
}
class cargoPlane extends plane{
	
	void fly() {
		System.out.println("cargoplane files at lower hights");
		
	} 
	void carrycargo() {
		System.out.println("cargoplane carries goods");
	}
	
}
class passengerPlane extends plane{
	void fly() {
		System.out.println("passenegerplane files at higher hights");
		
	} 
	void passengerPalne() {
		System.out.println("passengerplane uses for travelling people");
	}
	
}
public class methodsininhertiance {
public static void main(String[] args) {
	cargoPlane c1=new cargoPlane();
	c1.takeoff();
	c1.fly();
	c1.carrycargo();
	c1.land();
	System.out.println();
	passengerPlane p1= new passengerPlane();
	p1.takeoff();
	p1.fly();
	p1.passengerPalne();
	p1.land();
}
}
