package interviewQuestions;
import java.util.Scanner;

    
public class subarrays {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<ar.length;i++){
        ar[i]=scanner.nextInt();
    }
    suArray(ar);
}
    static void suArray(int[] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<=ar.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(ar[k] +" ");
                }
                System.out.println();
                
            }
        }
    }
}
