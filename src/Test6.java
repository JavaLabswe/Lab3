package test6;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("");
		int n=in.nextInt();
		System.out.print("");
		int m=in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				for(int k=1;k<=m;k++) {
					System.out.print(i);
				}
				System.out.print("      ");
			}
			
			System.out.println("");
		}
	}

}
