import java.util.Scanner;
public class No5 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m =in.nextInt();
		for(int i=1;i<=m;i++) {
			if(i%2==1) {
				for(int j=0;j<m;j++) {
					System.out.print('>');
				}
			
				for(int j=0;j<m;j++) {
					System.out.print('<');
				}
			}
			else {
				for(int j=0;j<m;j++) {
					System.out.print('<');
				}
			
				for(int j=0;j<m;j++) {
					System.out.print('>');
				}
			}
			System.out.println();
		}
	}
}
