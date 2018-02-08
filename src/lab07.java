import java.util.Scanner;

public class lab07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner som = new Scanner(System.in);
		int n,i,j;
		System.out.print("input ");
		n = som.nextInt();
		for( i=1;i<=n;i++) {
			if(i==1||i==n) {
				for( j=1;j<=n;j++) {
					System.out.print('*');
				}
				
			}
			else {
				for( j=1;j<=n;j++) {
					if(j==1||j==n) {
						System.out.print('*');
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			
			System.out.println();
			
		}

	}

}
