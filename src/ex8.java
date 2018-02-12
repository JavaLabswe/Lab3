

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	int n;
	System.out.println("input n:");
	n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (i==1 || j==1 || i==n || j==n) {
					System.out.print(i);
				}
				
				else {
					System.out.print(" ");
					
				}
			}
			System.out.println("");
		}
		
	}
}