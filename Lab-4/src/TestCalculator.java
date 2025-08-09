import mypackage.calculator;
public class TestCalculator {
     public static void main(String[] args) {
    	 calculator calc = new calculator();
    	 int sum = calc.add(69, 59);
    	 int diff = calc.subtract(69, 59);
    	 System.out.println("Sum: "+sum);
    	 System.out.println("diff: "+diff);
     }
}
