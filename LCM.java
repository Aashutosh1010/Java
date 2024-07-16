import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Values for LCM");
		int a = sc.nextInt(); int c=a;
		int b = sc.nextInt(); int d=b;
		int n=0; 
		int[] inttem= new int [n];
		int p=0; 
		int[] intten= new int [p]; 
		int s=0;
		int[] intan= new int [s]; 
		int r=1;
		int[] intprime= new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	
	for(int i=0; i<25; i++)
		{
			for(int j=intprime[i]; j<intprime[25]; j++)
			{
				if(c%j==0)
				{
					inttem[n]=j;
					n++;
					c=c/j;
					if(c==1)
					{
						break;
					}
				}
			}
		}
		
		for(int i=0; i<25; i++)
		{
			for(int j=intprime[i]; j<intprime[25]; j++)
			{
				if(d%j==0)
				{
					intten[p]=j;
					p++;
					d=d/j;
					if(d==1)
					{
						break;
					}
				}
			}
		}
		
		for(int q=0; q<p; q++)
		{
			for(s=0; s<r; s++)
			{
				if(inttem[q] == intten[q])
				{
					intan[s]=inttem[q];
					r++;
				}
				else
				{
					intan[s]=inttem[q];
					++s;
					r++;
					intan[s]=intten[q];
					r++;
				}
			}
			int ans=1;
			for (int e=0; e<s; e++)
			{
				ans=ans*intan[e];
			}
	System.out.println("Answer is "+ans);
}
}
}