import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("");
		n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n*2;j++) {
				if(i%2==0) {
					if(j<n) {
						System.out.print('<');
					}
					else {
						System.out.print('>');
					}
				}
				else {
					if(j<n) {
						System.out.print('>');
					}
					else {
						System.out.print('<');
					}
					
				}
			}
			
			System.out.println();
		}

	}

}