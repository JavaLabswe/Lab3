import java.util.Scanner;
public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n,i,j;
		n = inp.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i %2==0) {
					System.out.print('>');
					
				}
				else {
					System.out.print('<');
				}
					
			}
			System.out.println();
		}
	}

}
