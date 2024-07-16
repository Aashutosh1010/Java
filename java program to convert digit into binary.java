


public class JavaApplication5 {

   
    public static void main(String[] args) {
       int a = 150;
       int b;
       int r=0;
       int c[] =  new int[8];
       while(a>0)
       {
            b = a % 2;
            c[r] = b;
            r++;
            a = a/2;
       }
       System.out.println("Answer ");
        for (int i = 7; i>=0; i--)
        {
            System.out.print(c[i]);
            
        }
        System.out.println(" ");
    }
    
}
