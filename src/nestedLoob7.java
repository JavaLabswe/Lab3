import java.util.Scanner;
public class nestedLoob7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2 == 1 ) {
					System.out.print(">");
				}
				else {
					System.out.print("<");
				}
			}
			System.out.println(" ");
		}
	}
}

