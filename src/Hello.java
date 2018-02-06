import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("A"+" ");
			}
			System.out.println("");
		}

	}

}
