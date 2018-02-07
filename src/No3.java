import java.util.Scanner;
public class No3 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n =in.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					System.out.print('<');
				}
			}
			else {
				for(int j=0;j<n;j++) {
					System.out.print('>');
				}
			}
			System.out.println();
		}
		

	}

}
