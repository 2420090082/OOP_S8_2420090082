import java.util.Scanner;
public class celsius_and_fahrenheit {
	public static void main(String[] args) {
        System.out.println("Enter the value: ");
        Scanner sc=new Scanner(System.in);
        float c=sc.nextFloat();
        System.out.println("Fahrenheit is: " +((9/5)*c+32));
	}
}