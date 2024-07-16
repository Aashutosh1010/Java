import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check that it is a leap year or not");
		int a = sc.nextInt();
		if(a%4==0 || a%100==0 || a%400==0){
			System.out.println(a+ " is a Leap year");}
		else{
			System.out.println(a+ " is not a Leap year");}
	}
}