import java.util.Scanner;

public class Loop12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("N : ");
		int n = in.nextInt();
		
		for(int i=n ; i>=1 ; i--) {
			for(int j = 1 ; j<=((i*2)-1) ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
