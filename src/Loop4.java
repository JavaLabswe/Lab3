import java.util.Scanner;
public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n,i,j;
		n = inp.nextInt();
		for(i=1;i<=n;i++) {
			for(j=0;j<n*2;j++) {
				if(i%2==0) {
					if(j<n) {
						System.out.print('<');
					}
					else {
						System.out.print('>');
					}
				}
				else {
					if(j<n) {
						System.out.print('>');
					}
					else {
						System.out.print('<');
					}
					
				}
			}
			
			System.out.println();
		}
		
	}

}
