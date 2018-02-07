import java.util.Scanner;
public class NumberEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("enter n :");
		int n = inp.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1 || i==n) {
				for(int k=0;k<n;k++) {
					System.out.print(i);
				}
			}
			if(i==2 || i==n-1) {
				System.out.print(i);
				for(int j=2;j<n;j++) {
				System.out.print(" ");
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
