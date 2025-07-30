import java.util.*;
public class vowelconsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		sc.close();
		boolean as=Character.isAlphabetic(c);
		if(as) {
		switch(c) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
            System.out.println("Its a Vowel.");
            break;
            default:
            	System.out.println("Its a consonant.");
            	break;
		} 
	} else {
		System.out.println("Invalid Option x_x");
	}
	}
}