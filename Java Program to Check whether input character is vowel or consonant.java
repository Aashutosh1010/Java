import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Character to check whether it is Vowel or Consonant");
	char a = sc.next().charAt(0);
	if(a == 'A' || a == 'a' || a == 'E' || a == 'e' || a == 'I' || a == 'i' || a == 'O' || a == 'o' || a == 'U' || a == 'u'){
	    System.out.println(a+" is VOWEL");
	}
    else{
	    System.out.println(a+" is CONSONANT");
	    }
    }
}
	