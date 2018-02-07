import java.util.Scanner;
public class No4 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m =in.nextInt();
		int n =in.nextInt();
		for(int i=1;i<=m;i++) {
			if(i<=n) {
				for(int j=0;j<n/2;j++) {
					System.out.print('>');
				}
			}
				for(int j=0;j<n/2;j++) {
					System.out.print('<');
			}
			System.out.println();
		}
	}
}
