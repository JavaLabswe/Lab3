import java.util.Scanner;
public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("n:");
		n=in.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1||i==n ) {
				for(int h =1;h<=n;h++)
				System.out.print("*");
			}
			else {
				System.out.print("*");
			for(int j=2;j<n;j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			}
			System.out.println();
		}

		}
		

	}