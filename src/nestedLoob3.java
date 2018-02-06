import java.util.Scanner;
public class nestedLoob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m,n;
		m = in.nextInt();
		n = in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || j == 1 || i== m || j==n) {
					System.out.print("+");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println(" ");
		}
	}
}