package kn.com.Encapsulation;

public class ClassRoom 
{
	private int temprature;
	// getter
	public int getTemprature()
	{
		return this.temprature;
	}
	//setter
	public void setTemprature(int temp)
	{
		if(temp>=16 && temp<=25)
		{
			this.temprature = temp;
		}
		else
		{
			System.out.println("Invalid Temprature. It must be in a range of 16-25");
		}
	}
}