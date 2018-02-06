import java.util.Scanner;

public class Loop11 {

	public static void main(String[] args) {
		int m,l,n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("row : ");
		m = in.nextInt();
		System.out.println("l : ");
		l = in.nextInt();
		System.out.println("n : ");
		n = in.nextInt();
		
		for(int i = 1 ; i <= m ; i++) {
			for(int j=1 ; j <= l ; j++ ) {
				for (int k=1 ; k <= n ; k++) {
					System.out.print(k);
				}
				System.out.print(" ");
			}
			System.out.println("");
		}
		

	}

}
