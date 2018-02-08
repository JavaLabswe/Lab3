import java.util.Scanner;
public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int num;
		        Scanner in = new Scanner(System.in);
		        num = in.nextInt();
		        for(int i = 1; i <= num; i++) {
		            for(int j = num; j >= i; j--) {   
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		

	}


