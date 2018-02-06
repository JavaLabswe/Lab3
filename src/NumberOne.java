import java.util.Scanner;
public class NumberOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inp = new Scanner(System.in);
			System.out.print("enter n:");
			int n = inp.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("A");
				}
				System.out.println();
			}
	}

}
