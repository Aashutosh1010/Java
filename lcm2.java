import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Values for LCM");
		int a = sc.nextInt();
		int c = a;
		int b = sc.nextInt();
		int d = b;
		int n = 15;
		int[]tem = new int[n];
		int nt = 0;
		int pt = 0;
		int p = 15;
		int[] ten = new int[p];
		int s = 25;
		int[] an = new int[s];
		int r = 0;
		int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
					  };

		//for(int i=0; i<25; i++)
		{
			for (int j = prime[0]; j < prime.length; j++) {
				if (c % j == 0) {
					tem[nt] = j;
					nt++;
					c = c / j;
					if (c == 1) {
						break;
					}
				}
			}
		}

		//for(int i=0; i<25; i++)
		{
			for (int j = prime[0]; j < prime.length; j++) {
				if (d % j == 0) {
					ten[pt] = j;
					pt++;
					d = d / j;
					if (d == 1) {
						break;
					}
				}
			}
		}

		for (int q = 0; q < p; q++) {
			if (tem[q] != 0) {
				if (tem[q] == ten[q]) {
					an[r] = tem[q];
					r++;

				} else {
					an[r] = tem[q];
					r++;
					an[r] = ten[q];
					r++;

				}
			}
		}
		int ans = 1;

		for (int e = 0; e < r ; e++) {
			ans = ans * an[e];
          System.out.println("an= "+an[e]);
		}
		System.out.println("Answer is " + ans);

	}
}