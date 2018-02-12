

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m,l,n;
		Scanner in = new Scanner (System.in);
		
		System.out.println("input M :");
		m = in.nextInt();
		System.out.println("input L :");
		l = in.nextInt();
		System.out.println("input N :");
		n = in.nextInt();
		
		for(int i=1;i<=m;i++) {
			System.out.println();
			for (int j=1;j<=l;j++) {
				System.out.print(" ");
				for(int k=1;k<=n;k++) {
					System.out.print(j);
				}
			}
		}
		
	
	}

}
