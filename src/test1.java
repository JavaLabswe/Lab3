import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner (System.in);
		System.out.print("input");
		int p=n.nextInt();
		for(int j=1;j<=p;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("A");
			}
			System.out.println();
		}
		
		
	}

}
