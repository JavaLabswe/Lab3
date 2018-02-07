import java.util.Scanner;
public class NumberTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("enter m :");
		int m = inp.nextInt();
		System.out.print("enter n :");
		int n = inp.nextInt();
		System.out.print("enter l :");
		int l = inp.nextInt();
		for(int i=1;i<=m;i++) {
			for(int k=1;k<=n;k++) {
				for(int b=1;b<=l;b++) {
					System.out.print(k);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
