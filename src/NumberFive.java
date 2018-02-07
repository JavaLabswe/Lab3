import java.util.Scanner;
public class NumberFive {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Scanner inp = new Scanner(System.in);
				System.out.print("enter m :");
				int m = inp.nextInt();
				for(int i=1;i<=m;i++) {
					if(i%2!=0) {
						for(int j=0;j<m;j++) {
						System.out.print(">");
						}
					}
					for(int k=0;k<m;k++) {
						System.out.print("<");
					}
					if(i%2==0) {
						for(int j=0;j<m;j++) {
						System.out.print(">");
						}
					}
					System.out.println();
				}
		}
	}

