import java.util.Scanner;

public class Loop8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("n : ");
		n = in.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j = 1 ; j <= n ; j++) {
				if(i==1 || j==1 || j==n || i==n) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}


	}

}
