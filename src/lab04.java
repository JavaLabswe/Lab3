import java.util.Scanner;

public class lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner som = new Scanner(System.in);
		int n,m,i,j;
		System.out.print("input ");
		m = som.nextInt();
		n = som.nextInt();
		for( i=0;i<m;i++) {
			for( j=0;j<n;j++) {
				if(j<(n/2)){
					System.out.print('>');
				}
				else {
					System.out.print('<');
				}
			}
			System.out.println();
		}

	}

}
