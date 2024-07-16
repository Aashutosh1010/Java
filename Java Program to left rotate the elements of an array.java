import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array values for left rotation");
		int a[] = new int [5];
		int b;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("After Rotation");
		b = a[0];
		for (int k = 0; k < a.length; k++) {
			if (k < (a.length - 1)) {
				a[k] = a[k + 1];
			}
		}
		for (int l = 0; l < (a.length - 1); l++) {
			System.out.println("index " + l + "   elememt " + a[l]);
		}
		System.out.println("index " + (a.length - 1) + "   elememt " + b);
	}
}