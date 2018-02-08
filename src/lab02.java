import java.util.Scanner;

public class lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner som = new Scanner(System.in);
		int n,i,j;
		System.out.print("input ");
		n = som.nextInt();
		for(i=0;i<n;n--) {
			for(j=0;j<n;j++) {
				System.out.print("A");
			}
			System.out.println();
		}		
	}

}
