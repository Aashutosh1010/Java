import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array elements");
		int a[] = new int[5];
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			b = (a[j] > b) ? a[j] : b ;
		}
		System.out.println();
		System.out.println("Largest Array Element is " + b);
	}
}