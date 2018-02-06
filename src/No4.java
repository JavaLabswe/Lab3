import java.util.Scanner;
public class No4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n,m;
		System.out.println("Input m:");
		m=in.nextInt();
		System.out.println("Input n:");
		n=in.nextInt();
		for(int i=1;i<=m;i++) {	
			for(int j=1;j<=n/2;j++) {
				if(n%2==0) {
					System.out.print(">");}
				else {
					System.out.print(" ");}
			}
			for(int k=1;k<=n/2;k++) {
				if(n%2==0) {
					System.out.print("<");}
				else {
					System.out.print(" ");}
			}
			System.out.println(" ");
		}
		System.out.println();
	
	}
}





