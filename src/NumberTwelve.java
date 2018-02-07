import java.util.Scanner;
public class NumberTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("enter n :");
		int n = inp.nextInt();
		System.out.println();
		for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }                   
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }               
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }            
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }
		}
	}
