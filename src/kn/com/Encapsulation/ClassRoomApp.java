package kn.com.Encapsulation;

public class ClassRoomApp {

	public static void main(String[] args) 
	{
		ClassRoom c1 = new ClassRoom();
		System.out.println("Temprature = "+c1.getTemprature());
		c1.setTemprature(20);
		System.out.println("Temprature = "+c1.getTemprature());
	}
}