

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		int n;
		
		System.out.println("input Number:");
		n = in.nextInt();
		 for(int i=1;i<=n;i++) {
			
			 for (int j=n-i+1;j>0;j--) {
				 System.out.print("A");
				 
			 }
				System.out.println("");
			 
		 }
		
	}

}
