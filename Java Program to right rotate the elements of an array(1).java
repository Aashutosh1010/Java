import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array values for right rotation");
		int a[] = new int [5];
		int b;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("After Rotation");
		b = a[a.length - 1];
		for (int k = (a.length - 1); k > 0; k--) {
			a[k] = a[k - 1];
		}
		System.out.println("index " + 0 + "   elememt " + b);
		for (int l = 1; l < (a.length); l++) {
			System.out.println("index " + l + "   elememt " + a[l]);
		}
	}
}