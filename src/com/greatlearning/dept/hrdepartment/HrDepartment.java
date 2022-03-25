package com.greatlearning.dept.hrdepartment;
import com.greatlearning.dept.superdepartment.SuperDepartment;
import com.greatlearning.dept.hrdepartment.HrDepartment;
 public  class HrDepartment extends  SuperDepartment {
String name;
String todayswork;
String workdeadline;
String doactivity;
//creating method departmentName
public  String departmentName() {
	String name="Welcome to Hr department";
	System.out.println(name);
	return name;
}
//creating method getTodaysWork
	public  String getTodaysWork() {
	String todayswork= "Fill today worksheet and mark your attendence";
	System.out.println(todayswork);
	return todayswork;
}
	//creating method getWorkDeadline
	public  String getWorkDeadline() {
	String workdeadline= "Complete by EOD";	
	System.out.println(workdeadline);
	return workdeadline;
}
	//creating method doActivity
	public  String doActivity() {
	String doactivity="Team Lunch";
   System.out.println(doactivity);
   return doactivity;
}
}