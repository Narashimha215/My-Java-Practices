package kn.com.objects;

public class DetailsApp {

	public static void main(String[] args) 
	{
		Details d1 = new Details(1, "Narashimha", 98, "Male");
		Details d2 = new Details(2, "Ganesh", 90, "Male");
		Details d3 = new Details(3, "Siva", 80, "Male");
		
		Details srr[] =  new Details[3];
		srr[0] = d1;
		srr[1] = d2;
		srr[2] = d3;
		System.out.println("Id = "+srr[0].Id+"  Name = "+srr[0].name+"  Marks = "+srr[0].marks+"  Gender = "+srr[0].Gender);
		System.out.println("Id = "+srr[1].Id+"  Name = "+srr[1].name+"  Marks = "+srr[1].marks+"  Gender = "+srr[1].Gender);
		System.out.println("Id = "+srr[2].Id+"  Name = "+srr[2].name+"  Marks = "+srr[2].marks+"  Gender = "+srr[2].Gender);
	}
}