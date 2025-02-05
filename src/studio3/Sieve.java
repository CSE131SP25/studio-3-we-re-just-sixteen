package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many numbers do you want to look through?");
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); 
		boolean [] sieve = new boolean [n]; //boolean array all values false
		for (int i = 2; i <  n ; i++) {
			for (int j = 2 * i; j < n; j += i ) {
				if (j % 2 != 0 && j != 2) {
					sieve [j] = true; 
				}
				if (sieve [j] = true) {
					
				}
			}
			
			
		}
		 for (int v = 0; v < sieve.length; v++) {
			 if (sieve[v]) {
				 System.out.println("Index " + v + " is true");
			 
			 }
		 }
	}

}
