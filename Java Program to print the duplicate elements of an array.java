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
		System.out.println("Duplicate elements are");
		for (int j = 0; j < a.length; j++) {
			for (int k = (j + 1); k < a.length; k++) {
				if (a[j] == a[k]) {
					System.out.println(a[j] + "  ");
					break;
				}
			}
		}
	}
}