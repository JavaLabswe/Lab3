import java.util.Scanner;

public class lab304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,m;
		System.out.print("input ");
		m = in.nextInt();
		n = in.nextInt();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(j<(n/2)){
					System.out.print('>');
				}
				else {
					System.out.print('<');
				}
			}
			System.out.println();
		}

	}

}
