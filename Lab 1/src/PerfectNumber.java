import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int sum=0;
            for(int i=1;i<=x/2;i++) {
            	if (x%i==0) {
            		sum+=i;
            	}
            }
            if(sum==x) {
            	System.out.println("It is a perfect number");
            } else {
            	System.out.println("It is not a perfect number");
            }
	}
}