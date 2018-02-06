import java.util.Scanner;
public class Loop1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("N : ");
		int n = in.nextInt();
		
		for(int i=1 ; i<=n ; i++) {
			for(int j = 0 ; j<i ; j++) {
			System.out.print("A");
			}
			System.out.println("");
		}
	}

}
