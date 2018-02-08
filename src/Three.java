import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("");
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i %2==0) {
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