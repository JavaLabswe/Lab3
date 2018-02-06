import java.util.Scanner;
public class NumberThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner inp = new Scanner(System.in);
			System.out.print("enter n :");
			int n = inp.nextInt();
			for(int i=1;i<=n;i++) {
				if(i%2==1) {
					for(int j=0;j<n;j++) {
						System.out.print(">");
					}
				}
				else if(i%2!=1) {
					for(int k=0;k<n;k++) {
						System.out.print("<");
					}
				}
				System.out.println();
			}
	}

}
