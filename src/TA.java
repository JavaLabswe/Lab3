package test2A;

import java.util.Scanner;
public class TA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner (System.in);
		System.out.print("input");
		int p=n.nextInt();
		for(int i=0;i<=p;i++) {
			for(int j=p;j>i;j--) {
				System.out.print('A');
			}
			System.out.println("");
		}
	}
		
	}


