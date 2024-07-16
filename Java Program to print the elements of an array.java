import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Array Elements");
		int a[] = new int[5];
		int i = 0;
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array Elements");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}