package com.greatlearning.dept.admindepartment;
import com.greatlearning.dept.superdepartment.SuperDepartment;
import com.greatlearning.dept.admindepartment.AdminDepartment;

 public  class AdminDepartment extends SuperDepartment {
	 String name;
	 String work;
	 String workdeadline;
	//creating method departmentName
	public String departmentName() {
	String name ="Welcome to Admin Department";
	System.out.println(name);
	return name;
		
	}
	//creating method getTodayswork
	public  String getTodaysWork() {
		String work= "Complete your documents submission";
		System.out.println(work);
		return work;
		}
	//creating method getWorkDeadline
	public  String getWorkDeadline() {
		String workdeadline= "Complete by EOD";
		System.out.println(workdeadline);
		return workdeadline;
		
	}

 }
