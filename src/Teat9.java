package test9;
import java.util.Scanner;
public class Teat9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("");
		int m=in.nextInt();
		System.out.print("");
		int l=in.nextInt();
		System.out.print("");
		int n=in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=l;j++) {
				for(int k=1;k<=n;k++) {
					System.out.print(i);
				}
				System.out.print("   ");	
			}
			System.out.println("   ");
		}
		
	}

}
