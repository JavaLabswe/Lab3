import java.util.Scanner;
public class Loop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n,i,j,k,l;
		n = inp.nextInt();
		j=1;
		for(i=n;i>0;i-=2) {
			l=1;
				for(k=0;k<i;k++) {
					while(l<j) {
						System.out.print(" ");
						l++;
					}
						
					
					System.out.print('*');
				}
			
		
			
				j++;
			
			
			
			System.out.println();
		}
	}

}
