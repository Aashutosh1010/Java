// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter two Binary Numbers for Addition");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c[] = new int[8];
        int d[] = new int[8];
        int e[] = new int[8];
        
        for(int i=0; i<c.length; i++)
        {
            while(a>0)
            {
                c[i]=a%2;
                i++;
                a=a/2;
            }
        }
        
        for(int j=0; j<d.length; j++)
        {
            while(b>0)
            {
                d[j]=b%2;
                j++;
                b=b/2;
            }
        }
        for(int t=0; t<8; t++)
        {
           System.out.println(" c[]= "+c[t]+" d[]= "+d[t]+" ");
          
       }
        for(int k=0; k<8; k++)
        {
            if(c[k]==1 && d[k]==1)
            {
                e[k]=0;
                c[k+1]+=1;
            }
            else if (c[k]==2 && d[k]==0)
            {
                e[k]=0;
                c[k+1]+=1;
            }
            else if (c[k]==2 && d[k]==1)
            {
                e[k]=1;
                 c[k+1]+=1;
            }
            else 
            {
                e[k] = c[k]+d[k];
            }
        }
        
        System.out.print("Ans = ");
        for(int l=7; l=0; l--)
        {
            System.out.print(e[l]);
        }
    }
}