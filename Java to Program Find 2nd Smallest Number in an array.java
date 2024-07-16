import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array Elements");
		int a[] = new int[5];
		int b;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int k;
		for (int j = 0; j < a.length; j++) {
			for (k = 0; k < a.length - 1; k++) {
				if (a[k + 1] > a[k]) {
					b = a[k];
					a[k] = a[k + 1];
					a[k + 1] = b;
				}
			}
		}
		if (a[a.length - 1] > a[a.length - 2]) {
			b = a[a.length - 2];
			a[a.length - 2] = a[a.length - 1];
			a[a.length - 1] = b;
		}
		System.out.println();
		System.out.println("2nd Smallest Number");
			System.out.println(a[a.length-2]);
	}
}
