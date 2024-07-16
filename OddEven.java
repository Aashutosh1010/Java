import java.util.Scanner;
//Java Program to Check Even or Odd Integers
public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a = scnr.nextInt();
 		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}
}