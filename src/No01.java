import java.util.*;
public class No01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		System.out.print("Input : ");
		n=in.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("A");
			}
			System.out.println();
		}
	}

}