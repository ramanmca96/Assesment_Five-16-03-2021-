package com.CollectionProgram;


import java.util.TreeSet;

public class TreeSetExampleProgram {
	
public static void main(String[] args) {
	
	TreeSet<String> EmpName=new TreeSet<String>();
	EmpName.add("John");
	EmpName.add("Harry");
	EmpName.add("ABD");
	EmpName.add("ROBBi");
	EmpName.add("Chrish");
	
	for (String integer : EmpName) {
		System.out.println(integer);
	}
	

	TreeSet<String>ProjectLanguage=new TreeSet<String>();
	ProjectLanguage.add("JavaProject");
	ProjectLanguage.add("RUBYProject");
	ProjectLanguage.add("PYTHONProject");
	ProjectLanguage.add("SELENIUMProject");
	ProjectLanguage.add("JavaSpringBootProject");
	
	
	System.out.println(ProjectLanguage);
	
	TreeSet<Object>Company=new TreeSet<Object>();
	Company.addAll(EmpName);
	Company.addAll(ProjectLanguage);
	System.out.println(Company);
}
}
