// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args)
	{
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1])/100;
		int n = Integer.parseInt(args[2]);
		double squared = Math.pow(1+rate, n);
		double futureValue = currentValue*squared;
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate*100 + "% will yield $" + (int)futureValue);
	}
}