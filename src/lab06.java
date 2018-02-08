import java.util.Scanner;

public class lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner som = new Scanner(System.in);
		int m,p,i,j,k;
		System.out.print("input ");
		p = som.nextInt();
		m = som.nextInt();
		for( i=1;i<=p;i++) {
			for( j=0;j<m;j++) {
				for( k=0;k<m;k++) {
					System.out.print(i);
				}			
				System.out.print(" ");
			}	
			System.out.println();
		}

	}

}
