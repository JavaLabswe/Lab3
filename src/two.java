
import java.util.Scanner;
public class two {
    
    public static void main(String[] args) {
    	int n;
    	Scanner in = new Scanner(System.in);
    	n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i; j--) {   
                System.out.print("A");
            }
            System.out.println();
        }
    }
}