package com.greatlearning.dept.superdepartment;

public class SuperDepartment {
	String name;
	String todayswork;
	String workdeadline;
	String holiday;
	//creating method departmentName
public  String departmentName() {
		String name = "Welcome to super department";
		System.out.println(name);
		return name;
	}
//creating method getTodaysWork
public String getTodaysWork() {
		String todayswork ="No work as of now";
		System.out.println(todayswork);
		return todayswork;
		}
//creating method getWorkDeadline
public String getWorkDeadline() {
		String workdeadline ="Nil";
		System.out.println(workdeadline);
		return workdeadline;
	}
//creating method isTodayAHoliday
public String isTodayAHoliday() {
	String holiday ="Today is not a holiday";
	System.out.println(holiday);
	return holiday;
}
}



