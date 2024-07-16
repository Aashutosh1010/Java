import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 array elements");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Array Elements which are present on odd index");
		for (int j = 0; j < a.length; j++) {
			if (j % 2 == 1) {
				System.out.println(a[j]);
			}
		}
	}
}