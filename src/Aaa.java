import java.util.Scanner;
public class Aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int N =in.nextInt();
		for(int i=1;i<=N ;i++) {
			for(int j=0;j<i;j++) {
				System.out.print('A');
			}
			System.out.println();
		}
	}

}
