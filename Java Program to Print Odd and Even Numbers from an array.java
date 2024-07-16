import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int a[] = new int[5];
		int i;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("The Odd Numbers");
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
			}
		}
		System.out.println();
		System.out.println("The Even Numbers");
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}