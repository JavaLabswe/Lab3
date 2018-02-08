import java.util.Scanner;

public class lab309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m,n,l;
		System.out.print("input ");
		m = in.nextInt();
		l = in.nextInt();
		n = in.nextInt();
		
		for(int i=1;i<=m;i++) {
			for(int j=0;j<l;j++) {
				for(int k=0;k<n;k++) {
					System.out.print(i);
				}
				
				
				System.out.print(" ");
			}
			
			
			System.out.println();
		}

	}

}
