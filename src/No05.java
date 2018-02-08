import java.util.*;
public class No05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Input : ");
		n=in.nextInt();
		for(int i=1;i<=n;i++) {	
			if(i%2==1) {
				for(int j=1;j<=n*2;j++) {
					if(j<=n) {
						System.out.print(">");}
					else if(j>=n) {
						System.out.print("<");}
				}
			}
			else {
				for(int k=1;k<=n*2;k++) {
					if(k<=n) {
						System.out.print("<");}
					else if(k>=n) {
						System.out.print(">");}
				}
			}
			System.out.println(" ");
		}
		System.out.println();
	}
}