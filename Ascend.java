// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) 
	{
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int sum = a + b + c;
		int max1 = Math.max(a,b);
		int theMax = Math.max(max1,c);
		int min1 = Math.min(a,b);
		int theMin = Math.min(min1,c);
		int middle = sum - theMax - theMin;
		System.out.println(a + " " + b + " " + c);
		System.out.println(theMin + " " + middle + " " + theMax);
	}
}
