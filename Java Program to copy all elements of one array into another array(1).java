package Aashutosh05;
import java.util.Scanner;
public class Aashutosh05{
public static void main(String[] args) 
 {
    Scanner sc = new  Scanner (System.in);
    int a[] = new int[5];
    int b[] = new int[5];
    System.out.println("Enter 5 array values");
    for(int i=0; i<a.length; i++)
    {
        a[i]= sc.nextInt();
    }
    sc.close();
    for(int j=0; j<a.length; j++)
    {
        b[j]=a[j];
    }
    System.out.println("Copied Array values are");
    for(int p=0; p<b.length; p++)
    {
        System.out.println(b[p]);
    }
}
}