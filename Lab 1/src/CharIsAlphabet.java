import java.util.Scanner;
public class CharIsAlphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		sc.close();
		boolean a=Character.isAlphabetic(c);
		if(a) {
			System.out.println("It is a Alphabet.");
		} else {
			System.out.println("It is not a Alphabet x_x");
		}
	}
}
