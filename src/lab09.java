import java.util.Scanner;

public class lab09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner som = new Scanner(System.in);
		int m,n,l,j,i,k;
		System.out.print("input ");
		m = som.nextInt();
		l = som.nextInt();
		n = som.nextInt();
		
		for( i=1;i<=m;i++) {
			for( j=0;j<l;j++) {
				for( k=0;k<n;k++) {
					System.out.print(i);
				}
				
				
				System.out.print(" ");
			}
			
			
			System.out.println();
		}

	}

}
