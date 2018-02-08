import java.util.Scanner;
public class tttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,k,i;
		Scanner in = new Scanner(System.in);
		System.out.print(" ");
		n = in.nextInt();
		System.out.print(" ");
	    m = in.nextInt();
		for(i=1;i<=n;i++) {
			for(k=1;k<=n;k++) {
				for(int j=1;j<=m;j++) {
					System.out.print(i);
				}
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
      
	}

}
