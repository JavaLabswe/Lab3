import java.util.Scanner;

public class lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,i,j;
		System.out.print("input ");
		n = in.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("A");
			}
			System.out.println();
		}
		

	}

}
