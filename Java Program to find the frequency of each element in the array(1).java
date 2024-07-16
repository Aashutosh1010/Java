import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values of array to find Frequency of values");
		int a[] = new int[5];
		int c[] = {0,0,0,0,0};
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0; j<a.length; j++)
		{
			for(int k=0; k<a.length; k++)
			{
				if(a[j]==a[k])
				{
					c[j]++;
				}
			}
		}
		for(int l=0; l<a.length; l++)
		{
			System.out.println("Element:- "+a[l]+"  Frequency:- "+c[l]);
		}
	}
}