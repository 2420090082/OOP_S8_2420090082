package Lab3;
import java.util.*;
public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char[] ac=a.toCharArray();
		char[] bc=b.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		String t= new String(ac);
		String y= new String(bc);
        if(t.equals(y)) {
        	System.out.print("Anagram");
        } else {
        	System.out.println("Not An Anagram");
        }
	}

}
