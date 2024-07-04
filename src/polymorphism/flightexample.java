package polymorphism;
class Plane1{
	void fly() {
		System.out.println("Plane flies");
	}
}
class Cargo extends Plane1{
	@Override
	void fly() {
		System.out.println("cargoPlane ready to fly");
	}
}
class Passenger extends Plane1{
	@Override
	void fly() {
		System.out.println("Paseneger flies at medium height");
		
	}
}
class Fighter extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter flies at high heights");
	}
}
class Transport {
	void permit(Plane1 ref) {
		ref.fly();
		
	}
}


public class flightexample {
     public static void main(String[] args) {
    	 //1st type
	//Cargo c=new Cargo();
	//Passenger p=new Passenger();
	//Fighter f=new Fighter();
	//c.fly();
	//p.fly();
	//f.fly(); 3:3 Not a polymorphism 
    	 //2nd type
    	// Plane1 ref;
    	
    	Cargo c=new Cargo();
	Passenger p=new Passenger();
	Fighter f=new Fighter();
//ref=c;
//ref.fly();
 //ref=p;
 //ref.fly();
 //ref=f;
 //ref.fly(); //1:M
	
	//3rd type
	Cargo c1=new Cargo();
	Passenger p1=new Passenger();
	Fighter f1=new Fighter();
    	 Transport a=new Transport();
    	 a.permit(c1);
    	 a.permit(f1);
    	 a.permit(p1);
	
	
	
}
}
