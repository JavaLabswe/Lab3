import java.util.Scanner;
public class No03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Input : ");
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