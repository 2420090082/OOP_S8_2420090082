import java.util.*;
public class sumofdigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int n = num;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println("The sum is: "+ sum);
	}

}
