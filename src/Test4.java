import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("input m:");
		int m=in.nextInt();
		System.out.print("input n:");
		int n=in.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=(n/2)) {
					System.out.print(">");
				}
				else {
					System.out.print("<");
				}
				
			}
			System.out.println("");
		}
		
		

	}

}
