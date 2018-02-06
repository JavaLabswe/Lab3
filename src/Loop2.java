import java.util.Scanner;
public class Loop2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("N : ");
		int n = in.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			for(int j = n ; j>=i ; j--) {
				System.out.print("A");
			}
			System.out.println("");
		}

	}

}
