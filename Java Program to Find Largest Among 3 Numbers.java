import java.util.Scanner;
//Java Program to Find Largest Among 3 Numbers
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three values");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is largest");
		else if(b>a && b>c)
			System.out.println(b+" is largest");
		else 
			System.out.println(c+" is largest");
	}
}