package interviewQuestions;

import java.util.Scanner;


public class primefactor {
	static void primeFactor(int n) {
		int i=2;
		while(i*i<=n) {
			while(n%i==0) {
				System.out.print(i +" "); // O(root n log n)
				n=n/i;
				
			}
			i++;
		}
		if(n>1) {
			System.out.print(n);
		}
	}
	
	public static void main(String[] args ) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		primeFactor(n);
	}

}
