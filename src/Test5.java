package test5;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-geneethod stub
		Scanner in=new Scanner(System.in);
		System.out.print("input:");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
		if(i%2==0) {
			for(int j=1;j<=n;j++) {
				System.out.print('<');
			}
			for(int j=1;j<=n;j++) {
				System.out.print('>');
			}
			
		}
		else {
			for(int j=1;j<=n;j++) {
				System.out.print('>');
			}
			for(int j=1;j<=n;j++) {
				System.out.print('<');
			}
			
		}
		System.out.println(" ");
		}
	}

}
