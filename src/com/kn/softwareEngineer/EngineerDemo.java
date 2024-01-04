package com.kn.softwareEngineer;

public class EngineerDemo {

	public static void main(String[] args) 
	{
		SoftwareEngineer se = new SoftwareEngineer();
		se.attendMeeting();
		se.writeTestCase();
		System.out.println("===============================");
		
		BackEndEngineer be = new BackEndEngineer();
		be.attendMeeting();
		be.writeTestCase();
		be.doBackEndProject();
		System.out.println("===============================");
		
		DatabaseEngineer de = new DatabaseEngineer();
		de.attendMeeting();
		de.writeTestCase();
		de.doDataBaseProject();
		System.out.println("===============================");
		
		javaBackendEngineer je = new javaBackendEngineer();
		je.attendMeeting();
		je.writeTestCase();
		je.doBackEndProject();
		je.learnJava();
		System.out.println("===============================");
		
		PythonBackEndENgineer pe = new PythonBackEndENgineer();
		pe.attendMeeting();
		pe.writeTestCase();
		pe.doBackEndProject();
		pe.learnPython();
		System.out.println("================================");
	}
}