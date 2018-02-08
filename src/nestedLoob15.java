import java.util.Scanner;
public class nestedLoob15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
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