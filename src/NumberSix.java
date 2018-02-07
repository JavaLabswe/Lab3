import java.util.Scanner;
public class NumberSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("enter n :");
		int n = inp.nextInt();
		System.out.print("enter m :");
		int m = inp.nextInt();
		for(int i=1;i<=n;i++) {
			for(int k=0;k<m;k++) {
				for(int j=1;j<=m;j++) {
					System.out.print(i);
				}
				System.out.print(" ");

			}
			System.out.println();
		}
	}

}
