import java.util.Scanner;

public class lab312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n;
		System.out.print("input ");
		n =in.nextInt();
		for(int i=n;i>0;i--) {
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print('*');
			}
			for(int j=i;j>1;j--) {
				System.out.print('*');
			}
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
