import java.util.Scanner;
public class nestedLoob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" " + "A");
			}
			System.out.println(" ");
		}
	}

}
