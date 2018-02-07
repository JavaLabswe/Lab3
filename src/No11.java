import java.util.Scanner;
public class No11 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m =in.nextInt();
		int l =in.nextInt();
		int n =in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=l;j++) {
				for(int k=1;k<=n;k++) {
					System.out.print(k);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
