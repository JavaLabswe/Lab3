import java.util.Scanner;

public class lab308 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("input ");
		n = in.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==1||i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print(i);
				}
				
			}
			else {
				for(int j=1;j<=n;j++) {
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
