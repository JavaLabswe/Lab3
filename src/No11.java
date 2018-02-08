import java.util.*;
public class No11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m,n,l;
		System.out.print("Input : ");
		m=in.nextInt();
		n=in.nextInt();
		l = in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=l;k++) {
				System.out.print(k+"");	
				}
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
}