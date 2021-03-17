package com.CollectionProgram;


import java.util.LinkedHashSet;

public class LinkedHashSetExampleProgram {
	public static void main(String[] args) {
	
		LinkedHashSet<Employee>set=new LinkedHashSet<Employee>();
	
		Employee emp=new Employee(18461,"WillSmith",9944443294l,"Salem","Devlopment","FinanceProject");	
		Employee emp1=new Employee(18461,"JonyDepp",8300903294l,"Kalarampatty","QA","FinanceProject");
		Employee emp2=new Employee(18461,"TomHanks",9944443294l,"SriRangam","ScrumTeam","FinanceProject");
		Employee emp3=new Employee(18461,"Decaprio",9944443294l,"chinnaSalem","ManualTesting","FinanceProject");
		
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		
//		Iterator<Employee> iterator = set.iterator();
//		for (Employee employee : set) {
//			System.out.println(employee);
//		}
//		Iterator<Employee> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Object employee = iterator.toString();
//			System.out.println(employee);
			for (Employee employee : set) {
				System.out.println("empid:"+employee.empId+" "+"EmpName:" +employee.empName+" "+"empphoneNo:"+" "+employee.empPhoneno +" " +"empAddress:"+employee.empAddress+" "+"empDept:"+employee.empDept+" "+"EmployeeProject:"+employee.projectName);
			}
		}
	}


	class Employee{
		int empId;
		String empName;
		long empPhoneno;
		String empAddress;
		String empDept;
		String projectName;
	
		public Employee(int empId,String empName,long empPhoneno,String empAddress,String empDept,String projectName) {
			super();
			this.empId=empId;
			this.empName=empName;
			this.empPhoneno=empPhoneno;
			this.empAddress=empAddress;
			this.empDept=empDept;
			this.projectName=projectName;
			
		}
	}

