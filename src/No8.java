import java.util.Scanner;
public class No8 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m =in.nextInt();
		for(int i=1 ;i<=m;i++) {
			for(int j=1 ;j<=m ;j++) {
				if(i==1 || j==1 || i==m || j==m) {
					System.out.print(i);	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
