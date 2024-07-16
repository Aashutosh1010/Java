import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array Elements");
		int a[] = new int[5];
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Without Duplicate Elements ");
		for (int j = 0; j < a.length; j++) {
			for (int k = 0; k < a.length && k != j; k++) {
				if (a[j] == a[k]) {
					r++;
					break;
				}
			}
			if (r == 0) {
				System.out.println(a[j]);
			}
			r = 0;
		}
	}
}