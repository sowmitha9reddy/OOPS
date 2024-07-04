package AggregationCompisition;
class Charger{
	private String brand;
	private float voltage;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	
	public float getVoltage() {
		return voltage;
	}
}


class Os
{
	private String name;
	private float size;
	
	public Os(String name,float size) {
		this.name=name;
		this.size=size;
		
	}
	public String getname() {
		return name;
	}
	public float size() {
		return size;
	}
	
	
}
class Mobile 
{ 
	Os o=new Os("windows",64);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	
	
	
}
public class ChargerAndMobileExample {
public static void main(String[] args) {
	System.out.print("houhg");
	Charger c=new Charger();
	Mobile m=new Mobile();
	m.o.getname();
	m.hasA(c);
	m=null;
	m.o.getname();
	m.hasA(c);
	
	}
}

