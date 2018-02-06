import java.util.Scanner;
public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n,m,i,j;
		m = inp.nextInt();
		n = inp.nextInt();
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				if(j<(n/2)){
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
