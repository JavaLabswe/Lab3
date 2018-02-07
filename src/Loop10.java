import java.util.Scanner;
public class Loop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int m,n,l,i,j,k;
		m = inp.nextInt();
		l = inp.nextInt();
		n = inp.nextInt();
		
		for(i=1;i<=m;i++) {
			for(j=0;j<l;j++) {
				for(k=1;k<=n;k++) {
					System.out.print(k);
				}
				
				
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
	}

}