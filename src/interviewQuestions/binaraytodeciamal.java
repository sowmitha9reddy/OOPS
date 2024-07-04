package interviewQuestions;
import java.util.Scanner;

public class binaraytodeciamal {
	

	public class inheritanceConstructorChaining {
		static void binarytoDecimal(String s) {
			int sum=0;
			int j=0;
			
			for(int i=s.length()-1;i>=0;i--) {
	               if(s.charAt(i)=='1') {
	            	   sum+=Math.pow(2, j);
	               }
	               j++;
			}
			
			System.out.print(sum);
		} 
	

		public static void main (String[] args) {
			// TODO Auto-generated method stub
			Scanner sca=new Scanner(System.in);
			String s=sca.nextLine();

binarytoDecimal(s);
			
			

		}

	}
}


