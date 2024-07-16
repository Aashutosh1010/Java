import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number whose factorial you want");
		int a = sc.nextInt();
		int f = a;
		for(int i=a; i>1; i--)
		{
			f=f*(i-1);
		}
		System.out.println("The factorial of "+a+" is "+f);
	}
}