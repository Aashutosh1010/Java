import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Values for LCM");
		int c= sc.nextInt();
		int d = sc.nextInt();
		int i;
		 int a =(c > d)? c : d;  
 
         for(i = a ; i <= c*d ; i = i + a)  
            {  
            
                if(i % c == 0 && i % d == 0)  
                break;  
            }  
            
        System.out.println("LCM of "+c+" and "+d+" is: "+i);  
            }  
 }  