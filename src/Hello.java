import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		for(int i=100;i>=n;i--) {
			for(int j=100;j>=i;j--) {
				System.out.print("A"+" ");
			}
			System.out.println("");
		}

	}

}
