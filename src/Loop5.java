import java.util.Scanner;
public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int m ,n,i,j,k;
		n = inp.nextInt();
		m = inp.nextInt();
		for(i=1;i<=n;i++) {
			for(j=0;j<m;j++) {
				for(k=0;k<m;k++) {
					System.out.print(i);
				}
				
				
				System.out.print(" ");
			}
			
			
			System.out.println();
			
			
			
		}
		
		
	}

}