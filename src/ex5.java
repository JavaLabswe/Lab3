

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		int n;
		
		System.out.println("input Number:");
		n = in.nextInt();
		 for(int i=1;i<=n;i++) {
			
			 for (int j=1;j<=n*2;j++) {
				 if(j<n) {
					 if (i%2==0) {
						 System.out.print("<");
					 }
					 else {
						 System.out.print(">");
					 }
					 
				 }
				 else {
					 if (i%2!=0) {
						 System.out.print("<");
					 }
					 else {
						 System.out.print(">");
					 }
				 }
				 
				 
			 }
				System.out.println("");
			 
		 }
		
	}

}
