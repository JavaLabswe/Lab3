

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int m,n;
		System.out.println("input M");
		m = in.nextInt();
		System.out.println("input N");
		n = in.nextInt();
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if (j<n/2) {
					System.out.print(">");
				}
				else {
					System.out.print("<");
				}
			}
			System.out.println("");
		}
	}

}
