import java.util.Scanner;
public class NumberFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inp = new Scanner(System.in);
			System.out.print("enter m :");
			int m = inp.nextInt();
			System.out.print("enter n :");
			int n = inp.nextInt();
			for(int i=1;i<=m;i++) {
				if(i==i) {
					for(int j=0;j<n/2;j++) {
						System.out.print(">");
					}
				}
					for(int k=0;k<n/2;k++) {
						System.out.print("<");
				}
				System.out.println();
			}
	}

}