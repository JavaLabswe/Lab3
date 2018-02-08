import java.util.Scanner;
public class No10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m,n,l;
		System.out.print("m:");
		m=in.nextInt();
		System.out.print("l:");
		n=in.nextInt();
		System.out.print("n:");
		l = in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				for(int h=1;h<=l;h++) {
				System.out.print(j+" ");	
				}
				System.out.print("  ");
			}
			System.out.println();	
		}
	
		

	}

}
