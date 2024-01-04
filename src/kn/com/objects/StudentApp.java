package kn.com.objects;

public class StudentApp
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"Narashimha",92);
		Student s2 = new Student(2,"Ganesh",88);
		Student s3 = new Student(3,"siva",94);
		
		Student srr[] = new Student[3];
		srr[0] = s1;
		srr[1] = s2;
		srr[2] = s3;
		System.out.println("Id = "+srr[0].id+", Name = "+srr[0].name+", Marks = "+srr[0].marks);
		System.out.println("Id = "+srr[1].id+", Name = "+srr[1].name+", Marks = "+srr[1].marks);
		System.out.println("Id = "+srr[2].id+", Name = "+srr[2].name+", Marks = "+srr[2].marks);

	}
}