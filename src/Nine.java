import java.util.Scanner;
public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		System.out.print("");
	    int l = in.nextInt();
		System.out.print("");
		int n = in.nextInt();
		System.out.print("");
		for(i=1;i<=m;i++) {
			for(j=0;j<l;j++) {
				for(k=0;k<n;k++) {
					System.out.print(i);	
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
	

}
