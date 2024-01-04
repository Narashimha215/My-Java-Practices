package kn.com.objects2;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Student srr[] = StudentUtillity.studentObjectCreation(3);
		int position = StudentUtillity.searchStudentById(srr,2);
		if(position >= 0)
		{
			System.out.println("Student found at "+position);
		}
		else
		{
			System.out.println("Student not found "+position);
		}
		int position2 = StudentUtillity.searchStudentByName(srr,"Amit");
		if(position2 >= 0)
		{
			System.out.println("Student found at "+position2);
		}
		else
		{
			System.out.println("Student not found "+position2);
		}
		Student srrByIdASC[] = StudentUtillity.sortStudentByIdASC(srr); 
		for(Student s:srrByIdASC)
		{
			System.out.println("[ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks+"]");
		}
	}
}