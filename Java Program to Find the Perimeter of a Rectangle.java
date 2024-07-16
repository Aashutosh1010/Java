import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner  sc= new Scanner(System.in);
	System.out.println("Enter Height and Width of Rectangle for its Perimeter");
	int h=sc.nextInt();
	int w=sc.nextInt();
	int p = 2*(h + w);
	System.out.println("The Perimeter of Rectangle is "+ p);
	}
}