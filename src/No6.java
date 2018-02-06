import java.util.Scanner;
public class No6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m,n,l;
		System.out.print("m:");
		m=in.nextInt();
		System.out.print("l:");
		n=in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				for(int h=1;h<=n;h++) {
				System.out.print(i+"");	
				}
				System.out.print("  ");
			}
			System.out.println();	
		}
	
		

	}

}
