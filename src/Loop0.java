import java.util.Scanner;
public class Loop0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n,i,j;
		n = inp.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("A");
			}
			System.out.println();
		}
		
		

	}

}
