// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) 
	{
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String ampm; 
		if (hours < 12)
		{
			ampm = "AM";
		}
		else if (hours == 12)
		{
			ampm = "PM";
		}
		else 
		{
			hours = hours - 12;
			ampm = "PM";
		}
		System.out.print(hours + ":");

		if (minutes<10) 
		{
			System.out.println("0" + minutes + " " + ampm);	
		}
		else 
		{
			System.out.println(minutes + " " + ampm);
		}
	}
}