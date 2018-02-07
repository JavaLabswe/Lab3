import java.util.Scanner;
public class Loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n,i,j;
		n = inp.nextInt();
		for(i=1;i<=n;i++) {
			if(i==1||i==n) {
				for(j=1;j<=n;j++) {
					System.out.print(i);
				}
				
			}
			else {
				for(j=1;j<=n;j++) {
					if(j==1||j==n) {
						System.out.print(i);
					}
					else {
						System.out.print(" ");
					}
				}
				
			}
			
			System.out.println();
			
		}
	}

}
