package com.greatlearning.dept.techdepartment;
import com.greatlearning.dept.superdepartment.SuperDepartment;
import com.greatlearning.dept.techdepartment.TechDepartment;
public  class TechDepartment extends SuperDepartment{
	String name;
	String todayswork;
	String workdeadline;
	String techstackinformation;
	//creating method departmentName
public  String departmentName() {
	String name="Welcome to Tech Department";
	System.out.println(name);
		return name;
}
//creating method getTodaysWork
public  String getTodaysWork() {
			String todayswork= "Complete coding of module 1";
			System.out.println(todayswork);
			return todayswork;
}
//creating method getWorkDeadline
public  String getWorkDeadline() {
	   String workdeadline= "Complete by EOD";
       System.out.println(workdeadline);
       return workdeadline;
}
//creating method getTechStackInformation
public  String getTechStackInformation() {
	String techstackinformation= "Core  java";
	System.out.println(techstackinformation);
	return techstackinformation;
}

}
