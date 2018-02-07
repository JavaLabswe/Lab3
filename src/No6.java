import java.util.Scanner;
public class No6 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m =in.nextInt();
		int n =in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=n;k++) {
					System.out.print(i);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
