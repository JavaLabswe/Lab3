package test12;

import java.util.Scanner;
public class Test12 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m =in.nextInt();
		for(int i=m;i>0;i--) {
			for(int k=i;k<m;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print('*');
			}
			for(int j=i;j>1;j--) {
				System.out.print('*');
			}
			for(int j=i;j<m;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}