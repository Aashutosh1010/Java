import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter Two numbers for between Armstrong numbers");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int j,i;
		int s=b-a;
		int ans[] = new int[s];
		int t=0;
		int y=50;
		int an[] = new int[y];
		int r=0;
		int sum=0;
		int rum=1;
		for(i=a; i<b; i++)
		{
			 j = i;
			while( j>0){
			if ( j < 10 )
			{
				an[r]=j;
				r++;
				j=0;
			}
			else {
				an[r] = j%10;
					r++;
					j=j/10;
			}
			}
			for(int p=0; p<r; p++)
			{
				for(int q=0; q<r; q++)
				{
					rum=rum*an[p];
				}
				sum+=rum;
				rum=1;
			}
			if(sum==i)
			{
				ans[t]=i;
				t++;
			}
			r=0;
			sum=0;
		}
		System.out.println("Armstrong numnbers between "+a+" & "+b);
		for(int k=0; k<t; k++)
		{
			System.out.println(ans[k]+" ");
		}
	}
}