package test8;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("input:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
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
