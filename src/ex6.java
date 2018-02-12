

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,m;
		
		System.out.println("input n:");
		n = in.nextInt();
		System.out.println("input m:");
		m = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=m;j++) {
				for(int k=1;k<=m;k++) {
					System.out.print(i);
				}
				System.out.print(" ");
				
			}
			System.out.println("");
			System.out.println();
		}
	}

}
