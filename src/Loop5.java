import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("n : ");
		int n = in.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 1 ; j<=n ; j++) {
				if(i%2==0) {
					System.out.print("<");
				}
				else {
					System.out.print(">");
				}
			}
			for(int k = 1 ; k<=n ; k++) {
				if(i%2==0) {
					System.out.print(">");
				}
				else {
					System.out.print("<");
				}
			}
			System.out.println("");
		}


	}

}
