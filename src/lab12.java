import java.util.Scanner;

public class lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner som =new Scanner(System.in);
		int n,i,l,k,j;
		System.out.print("input ");
		n =som.nextInt();
		for( i=n;i>0;i--) {
			for( k=i;k<n;k++) {
				System.out.print(" ");
			}
			for( j=i;j>=1;j--) {
				System.out.print('*');
			}
			for( j=i;j>1;j--) {
				System.out.print('*');
			}
			for( j=i;j<n;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
