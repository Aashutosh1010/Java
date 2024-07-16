import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 5 array elements for their sum ");
		int a[] = new int[5];
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			a[i]= sc.nextInt();
		}
		for(int j=0; j<a.length; j++)
		{
			sum+=a[j];
		}
		System.out.println("Sum  = "+sum);
	}
}