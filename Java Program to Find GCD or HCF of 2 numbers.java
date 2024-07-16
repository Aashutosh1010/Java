import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Values for GCD");
		int c= sc.nextInt();
		int d = sc.nextInt();
		int gcd=1;
		
		for(int i = 1; i <=c && i <= d; ++i)
    		{
               if(c % i == 0 && d % i == 0)
                gcd = i;
            }
            
        System.out.println("GCD = "+gcd);
        
        }  
 }  