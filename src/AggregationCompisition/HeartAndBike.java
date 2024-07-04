package AggregationCompisition;
class Heart{
	private int noofBeats;
	private float hemoglobin;
	Heart(int noofBeats, float hemoglobin){
		this.noofBeats=noofBeats;
		this.hemoglobin=hemoglobin;
	}
	int getnoofBeats() {
		return noofBeats;
	}
	float getHem() {
		return hemoglobin;
	}
}
class Brain{
	private int weight;
	private String color;
	Brain(int weight,String color){
		this.weight=weight;
		this.color=color;
	}
	int getWeigh() {
		return weight;
	}
	String getcolor(){
		return color;
	}
	
}
class Bike{
	private String name;
	private float cost;
	Bike(String name,float cost){
		this.name=name;
		this.cost=cost;
		
		
	}
	String getName() {
		return name;
	}
	float getcost() {
		return cost;
	}
	
}
class Books{
	private String name;
	private String author;
	Books(String name,String author){
		this.name=name;
		this.author=author;
		
	}
	String getName() {
		return name;
	}
	String getauthor() {
		return author;
	}
}
class Human{
	Heart h1=new Heart(72,14);
	Brain b1=new Brain(1,"brown");
void hasA(Bike b) {
	System.out.print(b.getName());
	System.out.print(b.getcost());
}
void hasABook(Books bo) {
	System.out.println(bo.getName());
	System.out.println(bo.getauthor());
	
}
	
	
}
public class HeartAndBike {
      public static void main(String[] args) {
    	  Human h=new Human();
    	  Books b1=new Books("java","jamesgosling");
    	  Bike b2=new Bike("KTM",92474.2f);
    	  System.out.println(h.h1.getnoofBeats());
    	  System.out.println(h.h1.getHem());
    	  System.out.println();
    	  
    	  System.out.println(h.b1.getWeigh());
    	  
    	  System.out.println(h.b1.getcolor());
    	  System.out.println();
    	  h.hasA(b2);
    	  h.hasABook(b1);
    	  
    	      	  
    	  
      }
}
