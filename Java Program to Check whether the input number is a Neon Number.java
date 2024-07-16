import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check either it is NEON or not");
		int a= sc.nextInt();
		int b=a*a;
		int c,d,e;
		
	    if(b<100)
	    {	
			c=b/10;
			d=b-(c*10);
			e=c+d;
			if(a==e){
				System.out.println(a+" is a Neon Number");
			}
			else{
				System.out.println(a+" is NOT a Neon Number");
			}
	    }
	    else
	    {
	    	System.out.println(a+" is NOT a Neon Number");
		}
	    
		
	}
}