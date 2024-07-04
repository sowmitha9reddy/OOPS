package Abstraction;
 abstract class Bird{
	abstract void eat();
	 abstract void fly();
}
 abstract class Eagle extends Bird{
	 @Override
	void fly() {
		System.out.println("Eagle flies");
		
	}
}
 class SerpantEagle extends Eagle{
	 @Override
	void eat() {
		System.out.println("serpant eats only sea food");
		
	}
 }
 class GoldenEagle extends Eagle{
	 @Override
	void eat() {
		System.out.println("gloden eats fresh food");
		
	}
 }
 class BirdFamily {
	void birdfly(Bird b){
		 b.eat();
		 b.fly();
		 
	}
 }

public class Birdexample {
         public static void main(String[] args) {
        	 SerpantEagle s1=new SerpantEagle();
        	 GoldenEagle g1=new GoldenEagle();
        	 BirdFamily bb=new BirdFamily();
        	 bb.birdfly(g1);
        	 bb.birdfly(s1);
        	 
         }
}
