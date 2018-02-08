import java.util.Scanner;

public class lab310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m,n,l;
		System.out.print("input ");
		m = in.nextInt();
		l = in.nextInt();
		n = in.nextInt();
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=l;j++) {
				for(int k=1;k<=n;k++) {
					System.out.print(j);
				}
				
				
				System.out.print(" ");
			}
			
			
			System.out.println();
		}

	}

}
