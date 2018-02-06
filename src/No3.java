import java.util.Scanner;
public class No3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Input n:");
		n=in.nextInt();
		for(int i=1;i<=n;i++) {			
			for(int j=0;j<n;j++) {
			if(i%2==0) {
			System.out.print("<");}
			else {
				System.out.print(">");}
			}
		System.out.println();

	}
	}
}



